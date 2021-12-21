package Streams;



public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	final double frete;
	
	public Produto(String nome, double preco, double d, double valor) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = d;
		this.frete = valor;
		
		
	}
	public String toString() {
		return this.nome;
	}
	
	
}
