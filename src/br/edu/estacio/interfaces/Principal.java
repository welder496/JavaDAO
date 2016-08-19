package br.edu.estacio.interfaces;

import br.edu.estacio.model.Diretor;
import br.edu.estacio.model.Pessoa;
import br.edu.estacio.persistence.DiretorDAO;
import br.edu.estacio.persistence.PessoaDAO;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Este é o programa principal. Permite que seja visualizado 
		 * como os objetos das classes DAO de Pessoa e Diretor podem ser manipulados
		 */
		
		DiretorDAO diretores = new DiretorDAO();
		PessoaDAO pessoas = new PessoaDAO();
		
		/**
		 * Salvando os diretores e pessoas!!
		 */
		diretores.salvar(new Diretor(0,"Rubens","Diretor de Operações"));
		diretores.salvar(new Diretor(1,"Lourenço","Diretor Executivo"));
		
		pessoas.salvar(new Pessoa(0,"Aline"));
		pessoas.salvar(new Pessoa(1,"Cláudia"));
		
		/**
		 * Imprimindo todas as pessoas e diretores
		 */
		System.out.println("Pessoas...");
		System.out.println();
		for (Pessoa pessoa: pessoas.selectionarTodos()){
			System.out.println("Código "+pessoa.getCodigo()+" Nome: "+pessoa.getNome());
		}
		System.out.println();
		
		System.out.println("Diretores...");
		System.out.println();
		for (Diretor diretor: diretores.selectionarTodos()){
			System.out.println("Código "+diretor.getCodigo()+" Nome: "+diretor.getNome());
		}
		System.out.println();

		/**
		 * Excluindo um diretor --> Rubens
		 */
		System.out.println("Excluindo Rubens");
		Diretor rubens = diretores.apagar(0);
		System.out.println("Nome do diretor excluído: "+rubens.getNome());
		System.out.println();

		/**
		 * Imprimindo todas as pessoas e diretores (de novo, sem o Rubens)
		 */
		System.out.println("Pessoas...");
		System.out.println();
		for (Pessoa pessoa: pessoas.selectionarTodos()){
			System.out.println("Código "+pessoa.getCodigo()+" Nome: "+pessoa.getNome());
		}
		System.out.println();
		
		System.out.println("Diretores...");
		System.out.println();
		for (Diretor diretor: diretores.selectionarTodos()){
			System.out.println("Código "+diretor.getCodigo()+" Nome: "+diretor.getNome());
		}
		System.out.println();
		
		
	}

}
