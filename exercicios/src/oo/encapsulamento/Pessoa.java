package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	private String sobrenome;
	
	Pessoa (String nome, String sobrenome, int idade){
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//getter
	public int getIdade() {
		return idade;
	}
	//setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade>=0 && novaIdade<= 125) {
			this.idade = novaIdade;
		}
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome()+" "+getSobrenome();
	}
	@Override
	public String toString() {
	
		return "Olá, eu sou "+ getNomeCompleto()+" e tenho "+getIdade()+" anos.";
	}
	
}
