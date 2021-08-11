package br.com.estoque.controller;

import java.io.IOException;

import br.com.estoque.model.command.InterfaceCommand;
import br.com.estoque.model.helper.EstoqueHelper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EstoqueController
 */
              
@WebServlet("/EstoqueController")
public class EstoqueController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private EstoqueHelper estoqueHelper = new EstoqueHelper();
    /**
     * Default constructor. 
     */
    public EstoqueController() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		processarRequisicao(request, response);
		
	}

	private void processarRequisicao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	
		estoqueHelper.setRequest(request);
		InterfaceCommand comando =estoqueHelper.getCommand();
		String pagina = comando.executete(request, response);
		request.getRequestDispatcher(pagina).include(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*doGet(request, response);*/
		processarRequisicao(request, response);
	}

}
