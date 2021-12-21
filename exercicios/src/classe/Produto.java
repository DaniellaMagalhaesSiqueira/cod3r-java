package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	//criamos um construtor de forma explícita
	Produto(){
		
	}
	Produto (String nomeInicial){
		nome = nomeInicial;
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
//	Produto(String nomeInicial, double precoInicial, double descontoInicial){
	//	nome = nomeInicial;
		//preco = precoInicial;
		//desconto = descontoInicial;
		
	//}
	
	
	
	double precoComDesconto(){
		return preco*(1-desconto);
	}
	double precoComDesconto(double descontoDoGerente){
		desconto = descontoDoGerente;
		return preco*(1-desconto);
	}
	

}
