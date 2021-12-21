package fundamentos;

import java.util.Scanner;
public class CalculadoraResposta {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o número:");
		double num1 = entrada.nextDouble();
		System.out.print("Informe o número:");
		double num2 = entrada.nextDouble();
		System.out.print("Informe a operação:");
		String op = entrada.next();
		
		//lógica
		
		double resultado = "+".equals(op) ? num1 + num2: 0;
		resultado = "-".equals(op) ? num1 - num2: resultado;
		resultado = "*".equals(op) ? num1 * num2: resultado;
		resultado = "/".equals(op) ? num1 / num2: resultado;
		
		System.out.println("O resultado é " + resultado);
	//	System.out.printf("%.2f %s %.2f = ?", num1, op, num2); Não funcionou
		
		entrada.close();
	}

}