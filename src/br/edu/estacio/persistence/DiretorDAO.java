package br.edu.estacio.persistence;

import java.util.ArrayList;
import java.util.List;

import br.edu.estacio.model.Diretor;

public class DiretorDAO implements DAO<Diretor> {

	/**
	 * Lista criada com o papel de registrar as pessoas manipuladas
	 */	
	private List<Diretor> diretores = new ArrayList<Diretor>();
	
	@Override
	public void salvar(Diretor t) {
		diretores.add(t);
	}

	@Override
	public Diretor selecionar(int codigo) {
		return diretores.get(codigo);
	}

	@Override
	public List<Diretor> selectionarTodos() {
		return diretores;
	}

	@Override
	public Diretor apagar(int codigo) {
		return diretores.remove(codigo);
	}

}
