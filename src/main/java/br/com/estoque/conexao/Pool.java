package br.com.estoque.conexao;

import java.sql.Connection;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.concurrent.ArrayBlockingQueue;

public class Pool implements InterfacePool {

	private InterfaceDataSource ds;
	private ArrayBlockingQueue<Connection> conexoesLivres;
	private HashMap<String, Connection> conexoesUtilizadas;
	private Integer numeroMaximoConexoes;
	private ResourceBundle config;
	
	private Pool() {
		config = ResourceBundle.getBundle("br.com.estoque.conexao.bancodedados");
		ds = new DataSource(config.getString("url"), 
							config.getString("driver"),
							config.getString("usuario"), 
							config.getString("senha"));
		
		numeroMaximoConexoes = Integer.parseInt(config.getString("numeroMaximoConexoes"));
		
	}
	
	@Override
	public Connection getConnection() {
		
		Connection con = null;
		
		try {
			if (conexoesUtilizadas.size() < numeroMaximoConexoes) {
				con = conexoesLivres.poll();
				if (con == null)
					con = ds.getConnection();
				else if(con.isClosed()) {
					this.getConnection();
				}
				conexoesUtilizadas.put(con.toString(), con);
			} 
		} catch (Exception e) {
			System.out.println("Problemas com o pool!");
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void liberarConnection(Connection con) {
		conexoesLivres.add(con);
		conexoesUtilizadas.remove(con.toString());
		

	}

}
