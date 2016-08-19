package br.edu.estacio.persistence;

import java.util.List;

public interface DAO<T> {

	public void salvar(T t);
	
	public T selecionar(int codigo);
	
	public List<T> selectionarTodos();
	
	public T apagar(int codigo);
	
}
