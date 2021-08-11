package br.com.estoque.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.estoque.conexao.InterfacePool;
import br.com.estoque.conexao.Pool;
import br.com.estoque.model.bean.Cliente;

public class ClienteDAO implements InterfaceClienteDAO {

	private InterfacePool pool;
	
	public ClienteDAO(InterfacePool pool) {
		this.pool = pool;
	}
	
	@Override
	public void excluir(Integer codigo) {
		// TODO Implementar excluir

	}

	@Override
	public void salvar(Cliente cliente) throws SQLException {
		
		Connection con = pool.getConnection();
		PreparedStatement ps;
		
		String sqlInsert = "INSERT INTO cliente (nome, endereco, email, bairro, cidade, cep, estado, fone, celuar, cpf, obs, rg, orgaorg, nascimento, desde, cnpj, insest, sexo, profissao, empresa, foneemp, renda, referencia, foneref, auditoria) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sqlInsert);
			
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getEndereco());
			ps.setString(3, cliente.getEmail());
			ps.setString(4, cliente.getBairro());
			ps.setString(5, cliente.getCidade());
			ps.setString(6, cliente.getCep());
			ps.setString(7, cliente.getEstado());
			ps.setString(8, cliente.getFone());
			ps.setString(9, cliente.getCeluar());
			ps.setString(10, cliente.getCpf());
			ps.setString(11, cliente.getObs());
			ps.setString(12, cliente.getRg());
			ps.setString(13, cliente.getOrgaorg());
			ps.setDate(14, cliente.getNascimento());
			ps.setDate(15, cliente.getDesde());
			ps.setString(16, cliente.getCnpj());
			ps.setString(17, cliente.getInsest());
			ps.setString(18, cliente.getSexo());
			ps.setString(19, cliente.getProfissao());
			ps.setString(20, cliente.getEmpresa());
			ps.setString(21, cliente.getFoneemp());
			ps.setDouble(22, cliente.getRenda());
			ps.setString(23, cliente.getReferencia());
			ps.setString(24, cliente.getFoneref());
			ps.setString(25, cliente.getAuditoria());
			
			ps.executeUpdate();
			ps.close();
						
		} finally{
			pool.liberarConnection(con);
		}
		

	}

	@Override
	public void atualizar(Cliente cliente) {
		// TODO Implementar atualizar

	}

	@Override
	public Cliente getCliente(Integer codigo) {
		// TODO Implementar getCliente
		return null;
	}

	@Override
	public List<Cliente> getCliente() {
		// TODO Implementar Listar getCliente
		return null;
	}

}
