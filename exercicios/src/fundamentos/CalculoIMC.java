package fundamentos;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira seu peso: ");
		String peso = entrada.next().replace(",", ".");
		double pesod = Double.parseDouble(peso);

		System.out.println("Insira sua altura: ");
		String altura = entrada.next().replace(",", ".");
		double alturad = Double.parseDouble(altura);
		
		entrada.close();
		
		double imc = pesod / (Math.pow(alturad, 2));
		
		String resultado = imc <= 17 ? "muito abaixo do peso.":"none";
		resultado = imc >= 17 && imc <= 18.49 ? "abaixo do peso.": resultado;
		resultado = imc >= 18.50 && imc <= 24.99 ? "com peso normal.": resultado;
		resultado = imc >= 25 && imc <= 29.99 ? "acima do peso.": resultado;
		resultado = imc >= 30 && imc <= 34.99 ? "com obesidade.": resultado;
		resultado = imc >= 35 && imc <= 39.99 ? "com obesidade severa.": resultado;
		resultado = imc >= 40 ? "com obesidade mórbida.": resultado;		
		
		System.out.print("Seu índice de massa corporal é " + imc+" e você está "+ resultado);
		
	}

}
