package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[]args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite aqui a m?dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0){
			System.out.println("Aprovado.");
			System.out.println("Parab?ns!");
		}
			
		else{
			System.out.println("Reprovado.");
		}
		entrada.close();
	}

}
