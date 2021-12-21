package lambdas;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2)/2; //não precisa explicitar Double na frente dos valores
		System.out.println(media.apply(9.8, 5.7));
		
//		BiFunction <Double, Double, String> resultado =
//				(n1, n2) -> ((n1+n2)/2)>=7 ? "Aprovado":"Reprovado";
		BiFunction <Double, Double, String> resultado = (n1, n2) -> {
			Double notaFinal = (n1+n2)/2;
			return notaFinal >= 7 ? "Aprovado":"Reprovado";
		}; // como o conteúdo das chaves é uma expressão precisa de ponto e vírgula
		
		System.out.println(resultado.apply(9.7,5.7));
		
		Function <Double, String> conceito = m -> m>= 7 ?"Aprovado":"Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.8,5.7));
	}
}
