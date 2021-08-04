package br.com.estoque.model.helper;

import java.util.HashMap;

import br.com.estoque.model.command.InterfaceCommand;
import jakarta.servlet.http.HttpServletRequest;

public class EstoqueHelper {

	private HashMap<String, InterfaceCommand> mapaComandos;
	private HttpServletRequest request;
	
	public EstoqueHelper(HttpServletRequest request) {
		this.request = request;
	}
	
	public InterfaceCommand getCommand() {
		return mapaComandos.get(request.getParameter("cmd"));
	}
	
}
