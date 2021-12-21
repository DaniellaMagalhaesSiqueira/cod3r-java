package Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	private Utilitarios() {//construtor privado para impedir que algu�m instancie objetos dessa classe
		//pode ser uma interface tamb�m, teria que tirar o final das lambdas e fun��es
		
	}
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) +"";
	public final static String grito(String n) {
		return n + "!!! ";
	}
}
