package coleceos;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
//Tanto offer quanto add adicionam, a diferença é o comportamento quando a
//fila está cheia, add dá um erro e offer retorna falso.
		
		fila.add("Ana");//retorna false
		fila.offer("Carlos");//lança uma exceção
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		System.out.println(fila.peek());//se não tiver ninguém ele retorna nulo
		System.out.println(fila.peek());
		System.out.println(fila.element());//se estiver vazia retorna um erro
		
		//fila.clear();
		//fila.size();
		//fila.isEmpty();
		//fila.contains(obj);
		
		
		System.out.println(fila.poll());//remove e retorna null se vazia
		System.out.println(fila.remove());//remove e lança uma exceção se vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
	
		
		
	}
}
