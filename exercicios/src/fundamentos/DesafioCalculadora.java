package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main (String[]args){
		//ler num1
		//ler num2
		//+ ou _ ou * ou /
		// fazer a opera��o do n�mero um ao numero dois

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: \n");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite outro n�mero: \n");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite uma opera��o '+','-','*','/': \n");
		String op = entrada.next();//estava errando pq coloquei nextLine!!!

		/*String op = operacaoEscolhida;
		double adicao = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
		
		String ad = "+";
		String sub = "-";
		String mult = "*";
		String div = "/";
	*/	
	
		entrada.close();
		
		double operacaoFinal = "+".equals(op) ? num1+num2: 0;
		operacaoFinal = "-".equals(op)? num1-num2:operacaoFinal;
		operacaoFinal = "*".equals(op)? num1*num2:operacaoFinal;
		operacaoFinal = "/".equals(op)? num1/num2:operacaoFinal;
		
		
		System.out.println("O resultado da sua opera��o foi: " + operacaoFinal);
		
	
	}

}
