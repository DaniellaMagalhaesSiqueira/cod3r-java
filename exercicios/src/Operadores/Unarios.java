package Operadores;

public class Unarios {
	public static void main(String[]args){
		int a = 1;
		int b = 2;
		//a++; a = a + 1
		//b--; b = b-1
		
		System.out.println(++a == b--);//o ++ na frente diz que o operador
		//será incrementado antes da comparação, já com b-- ele só será
		//decrementado depois da comparação, por isso o resultado é true
		System.out.println(++a == --b);
	}

}
