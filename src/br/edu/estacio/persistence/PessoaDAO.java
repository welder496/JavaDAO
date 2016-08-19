package br.edu.estacio.persistence;

import java.util.ArrayList;
import java.util.List;

import br.edu.estacio.model.Pessoa;

public class PessoaDAO implements DAO<Pessoa>{

	/**
	 * Lista criada com o papel de registrar as pessoas manipuladas
	 */
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	@Override
	public void salvar(Pessoa t) {
		pessoas.add(t);		
	}

	@Override
	public Pessoa selecionar(int codigo) {
		return pessoas.get(codigo);
	}

	@Override
	public List<Pessoa> selectionarTodos() {
		// TODO Auto-generated method stub
		return pessoas;
	}

	@Override
	public Pessoa apagar(int codigo) {
		return pessoas.remove(codigo);
	}

}
