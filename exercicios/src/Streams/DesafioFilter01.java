package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class DesafioFilter01 {
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3590.89, 0.34, 100.00);
		Produto p2 = new Produto("TV 40''", 3000.57, 0.15, 20.00);
		Produto p3 = new Produto("Armário", 1980.76, 0.27, 00);
		Produto p4 = new Produto("Fogão", 789.90, 0.17, 00);
		Produto p5 = new Produto("PlayStation 5", 4098.99, 0.32, 00);
		Produto p6 = new Produto("Cortinas", 180.76, 0.40, 00);
		
		List<Produto> prods = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate <Produto> promocao = p -> p.desconto >= 0.30;
		Predicate <Produto> freteGratis = p -> p.frete==0.0;
		Function <Produto, String> superpromocao = p -> "Superpromoção de "+ p.nome +"!!! Frete Grátis!!!";
		
		prods.stream()
		.filter(promocao)
		.filter(freteGratis)
		.map(superpromocao)
		.forEach(System.out::println);//final da pipeline
		
	}
}
