package coleceos;

import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		//adicionar
		//com restrição de capacidade add retorna boolean true or false
		//push retorna uma exceção
		livros.add("O Prqueno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		//mostra
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//remove
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.remove());
		System.out.println(livros.poll());
		System.out.println(livros.pop());//exceção se vazia
		
		
	}
}
