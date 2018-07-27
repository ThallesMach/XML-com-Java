package br.com.alura.Model;

public class Produto {

	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	@Override
	public String toString() {
		return "Nome:" + this.nome + "\n Preço:" + this.preco + "\n";
	}
}
