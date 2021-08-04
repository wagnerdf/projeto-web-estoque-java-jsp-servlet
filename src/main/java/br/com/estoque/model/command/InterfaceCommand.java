package br.com.estoque.model.command;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public interface InterfaceCommand {
	
	public String executete(HttpServletRequest request,	HttpServletResponse response);
	

}
