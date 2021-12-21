package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String[]args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do triângulo equilátero: ");
		String alt = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(alt);
		
		System.out.println("Digite a base do triângulo: ");
		String bas = entrada.next().replace(",", ".");
		double base = Double.parseDouble(bas);
		
		entrada.close();
		
		double area = (base* altura)/2;
		
		System.out.println("A área do seu triângulo é: "+area);
		
		
	}
}
