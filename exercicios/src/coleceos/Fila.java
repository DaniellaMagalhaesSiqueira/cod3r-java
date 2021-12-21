package coleceos;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
//Tanto offer quanto add adicionam, a diferen�a � o comportamento quando a
//fila est� cheia, add d� um erro e offer retorna falso.
		
		fila.add("Ana");//retorna false
		fila.offer("Carlos");//lan�a uma exce��o
		fila.add("Daniel");
		fila.offer("Rafaela");
		fila.add("Gui");
		
		System.out.println(fila.peek());//se n�o tiver ningu�m ele retorna nulo
		System.out.println(fila.peek());
		System.out.println(fila.element());//se estiver vazia retorna um erro
		
		//fila.clear();
		//fila.size();
		//fila.isEmpty();
		//fila.contains(obj);
		
		
		System.out.println(fila.poll());//remove e retorna null se vazia
		System.out.println(fila.remove());//remove e lan�a uma exce��o se vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
	
		
		
	}
}
