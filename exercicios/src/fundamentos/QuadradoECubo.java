package fundamentos;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double num = entrada.nextDouble();
		
		entrada.close();
		
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.println
		("O n�mero ao quadrado �: "+ quad+ "\nO n�mero ao cubo �: "+ cubo);
		
	}
	

}
