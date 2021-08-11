package br.com.estoque.model.command;

import java.sql.SQLException;

import br.com.estoque.model.bean.Cliente;
import br.com.estoque.model.dao.ClienteDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CadastrarCliente implements InterfaceCommand {

	private ClienteDAO clienteDAO;
	
	
	public CadastrarCliente(ClienteDAO clienteDAO) {
		super();
		this.clienteDAO = clienteDAO;
	}

	@Override
	public String executete(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setBairro(request.getParameter("bairro"));
		cliente.setCeluar(request.getParameter("celular"));
		cliente.setCep(request.getParameter("cep"));
		cliente.setCidade(request.getParameter("cidade"));
		cliente.setCnpj(request.getParameter("cnpj"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setDesde(null); //Tratar campo data
		cliente.setEmail(request.getParameter("email"));
		cliente.setEmpresa(request.getParameter("empresa"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setEstado(request.getParameter("estado"));
		cliente.setFone(request.getParameter("fone"));
		cliente.setFoneemp(request.getParameter("foneemp"));
		cliente.setFoneref(request.getParameter("foneref"));
		cliente.setInsest(request.getParameter("insest"));
		cliente.setBairro(request.getParameter("Bairro"));
		cliente.setNascimento(null);//Tratar campo data
		cliente.setNome(request.getParameter("nome"));
		cliente.setObs(request.getParameter("obs"));
		cliente.setOrgaorg(request.getParameter("orgaorg"));
		cliente.setProfissao(request.getParameter("profissao"));
		cliente.setReferencia(request.getParameter("referencia"));
		cliente.setRenda(Double.valueOf(request.getParameter("renda")));
		cliente.setRg(request.getParameter("rg"));
		cliente.setSexo(request.getParameter("sexo"));
		
		try {
			clienteDAO.salvar(cliente);
			request.setAttribute("mensagem", "Cliente ("+cliente.getNome()+") gravado com sucesso!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			request.setAttribute("mensagem", "Problemas com a gravação: "+e.getMessage());
			e.printStackTrace();
		}
		
		return "cadastro_cliente.jsp";
	}

}
