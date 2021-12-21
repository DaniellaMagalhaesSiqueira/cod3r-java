package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	public static void main(String[] args) {
		List <String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List <Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);//precisa de casting (Integer)	
		System.out.println(ultimoNumero);		
		
		Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);//não precisa fazer o casting
		System.out.println(ultimoNumero2);		
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
	}
}	
