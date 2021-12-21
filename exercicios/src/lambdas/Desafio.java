package lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;



public class Desafio {
	public static void main(String[] args) {
		/*
		 * 1. A partir do produto calcular o pre�o real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/<2500(Isento)
		 * 3. Frete: >= 3000(100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		*/
		
		Function <Produto, Double> precoFinal = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator <Double> comImposto = valor -> valor >= 2500 ? valor + (valor*1.085):valor;
		UnaryOperator<Double> comFrete = valor -> valor >= 3000 ? valor+100:valor+50;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f" , preco));
		Function <Double, String> formatar = valor -> ("R$"+ valor).replace(".",",");
		
		Produto p = new Produto("iPad", 3235.89,0.13);
		
		String preco = precoFinal
				.andThen(comImposto)
				.andThen(comFrete)
				.andThen(arredondar)
				//arredondar est� dando erro...
				.andThen(formatar)
				.apply(p);
		System.out.println("O preco final � "+ preco);
		
	
	}
}
