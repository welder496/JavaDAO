package br.edu.estacio.model;

public class Diretor {

	private int codigo;
	
	private String nome;
	
	private String função;

	/**
	 * Construtor da classe Diretor
	 * @param codigo
	 * @param nome
	 */
	public Diretor(int codigo, String nome, String função){
		this.codigo = codigo;
		this.nome = nome;
		this.função = função;
	}
	
	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
