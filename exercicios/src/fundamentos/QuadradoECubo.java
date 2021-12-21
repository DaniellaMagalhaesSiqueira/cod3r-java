package fundamentos;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		
		entrada.close();
		
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.println
		("O número ao quadrado é: "+ quad+ "\nO número ao cubo é: "+ cubo);
		
	}
	

}
