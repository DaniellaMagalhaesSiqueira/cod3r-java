package Operadores;

public class Unarios {
	public static void main(String[]args){
		int a = 1;
		int b = 2;
		//a++; a = a + 1
		//b--; b = b-1
		
		System.out.println(++a == b--);//o ++ na frente diz que o operador
		//ser� incrementado antes da compara��o, j� com b-- ele s� ser�
		//decrementado depois da compara��o, por isso o resultado � true
		System.out.println(++a == --b);
	}

}
