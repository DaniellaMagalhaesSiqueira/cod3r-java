package Operadores;

public class Atribuicao {
	public static void main (String[] args){
		int a = 3;
		int b = a;
		int c = a+b;
		c += b;// c = c+b
		c -= a;
		c *= b; 
		c /= a;
		c %=2; //c = c %2 saberemos se c é par ou ímpar
		
			System.out.println(c);
		
		
	}
}
