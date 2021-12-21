package Operadores;

public class DesafioAritmeticos {
	public static void main(String[]args){
		int a = 6* (3+2);
		int b = (int)Math.pow(a,2);
		int c = (1-5)*(2-7);
		int d = (int) Math.pow(c, 2)/2;
		int e = (int)b/(3*2);
		int f = (int) d/2;
		int g = (int)Math.pow(10, 3);
		int h = (int) Math.pow((e-f), 3);
		int i = (int) h/g;
		
		System.out.println(i);
		
	}

}
