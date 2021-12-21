package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Julia", "Amoedo",-30);
		//p1.idade = -30;//alterar
//		p1.alterarIdade(20);
		
		
		System.out.println(p1.toString());//ler
	}
}
