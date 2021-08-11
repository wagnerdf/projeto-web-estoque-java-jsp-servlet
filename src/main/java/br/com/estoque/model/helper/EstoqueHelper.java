package br.com.estoque.model.helper;

import java.util.HashMap;

import br.com.estoque.conexao.InterfacePool;
import br.com.estoque.conexao.Pool;
import br.com.estoque.model.command.CadastrarCliente;
import br.com.estoque.model.command.InterfaceCommand;
import br.com.estoque.model.dao.ClienteDAO;
import jakarta.servlet.http.HttpServletRequest;

public class EstoqueHelper {

	private HashMap<String, InterfaceCommand> mapaComandos;
	private HttpServletRequest request;
	


	private InterfacePool pool;
	
	
	public EstoqueHelper() {
		this.pool = new Pool();
		this.request = request;
		mapaComandos = new HashMap<String, InterfaceCommand>();
		mapaComandos.put("cadastrarCliente", new CadastrarCliente(new ClienteDAO(pool)));
	}
	
	public InterfaceCommand getCommand() {
		return mapaComandos.get(request.getParameter("cmd"));
	}
	
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
}
