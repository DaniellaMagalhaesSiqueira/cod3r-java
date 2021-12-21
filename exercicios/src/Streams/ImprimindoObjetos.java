package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui","Luca", "Ana");
		System.out.println("Usando o foreach...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		System.out.println("\nUsando o Itarator...");
		
		Iterator <String> iter = aprovados.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("\nUsando o Stream...");//Laço interno
		
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);
		
	}
}
