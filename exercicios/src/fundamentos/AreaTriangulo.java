package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main (String[]args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a altura do tri�ngulo equil�tero: ");
		String alt = entrada.next().replace(",", ".");
		double altura = Double.parseDouble(alt);
		
		System.out.println("Digite a base do tri�ngulo: ");
		String bas = entrada.next().replace(",", ".");
		double base = Double.parseDouble(bas);
		
		entrada.close();
		
		double area = (base* altura)/2;
		
		System.out.println("A �rea do seu tri�ngulo �: "+area);
		
		
	}
}
