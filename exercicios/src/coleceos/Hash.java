package coleceos;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		//usaremos o obj usuario
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		usuarios.add(new Usuario ("Pedro"));
		usuarios.add(new Usuario ("Ana"));
		usuarios.add(new Usuario ("Guilherme"));
		
		System.out.println(usuarios.contains("Guilherme"));//se estiver comentado 
		//o hash code lá na classe usuario essa expressão será falsa		
	}

}
