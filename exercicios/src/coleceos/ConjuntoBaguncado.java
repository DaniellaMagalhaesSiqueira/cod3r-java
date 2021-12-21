package coleceos;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })//fica sem advert�ncia
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//converte o double em uma classe Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("x");//char -> Charactere
		
		
		System.out.println("Tamanho � " + conjunto.size()+ " elementos");
		
		conjunto.add("teste");//n�o aceita repeti��o
		
		System.out.println("Tamanho � " + conjunto.size()+ " elementos");
		System.out.println(conjunto.remove("teste"));//retorna se conseguiu remover boolean
		System.out.println(conjunto.contains("x"));//verifica se est� ou n�o no conjunto
		System.out.println(conjunto.contains(4));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//uni�o entre dois conjuntos
		conjunto.retainAll(nums);//intersec��o
		System.out.println(conjunto);
		System.out.println(nums);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
