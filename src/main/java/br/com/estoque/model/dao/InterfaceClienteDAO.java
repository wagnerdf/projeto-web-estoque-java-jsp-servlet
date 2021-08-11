package br.com.estoque.model.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.estoque.model.bean.Cliente;

public interface InterfaceClienteDAO {

	public abstract void excluir(Integer codigo);
	public abstract void salvar(Cliente cliente) throws SQLException;
	public abstract void atualizar(Cliente cliente);
	public abstract Cliente getCliente(Integer codigo);
	public abstract List<Cliente> getCliente();
	
}
