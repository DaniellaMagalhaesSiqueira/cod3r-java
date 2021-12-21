package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		 * 1. Número para string binária... 6=> "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para um inteiro => "011" => 3
		 * ler a classe Integer para descobrir...
		 */
		
		Function<Integer, String> sb = num -> Integer.toBinaryString(num);
		UnaryOperator <String> invertido = st -> new StringBuilder(st).reverse().toString();
		Function<String, Integer> result = st -> Integer.parseInt(st, 2);//string binária(2) para um inteiro
		
		nums.stream().map(sb).map(invertido).map(result).forEach(System.out::print);

		/* nums.stream()
		 * .map(Integer::toBinaryString)
		 * .map(invertido)
		 * .map(result)
		 * 
		 */
	}
}
