package coleceos;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })//fica sem advertência
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);//converte o double em uma classe Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("x");//char -> Charactere
		
		
		System.out.println("Tamanho é " + conjunto.size()+ " elementos");
		
		conjunto.add("teste");//não aceita repetição
		
		System.out.println("Tamanho é " + conjunto.size()+ " elementos");
		System.out.println(conjunto.remove("teste"));//retorna se conseguiu remover boolean
		System.out.println(conjunto.contains("x"));//verifica se está ou não no conjunto
		System.out.println(conjunto.contains(4));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//união entre dois conjuntos
		conjunto.retainAll(nums);//intersecção
		System.out.println(conjunto);
		System.out.println(nums);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
