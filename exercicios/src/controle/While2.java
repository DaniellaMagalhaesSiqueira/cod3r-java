package controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		String frase = "";
		
		while(!("sair".equalsIgnoreCase(frase))){
		
			System.out.println("Digite algo ou digite 'sair' para sair do programa:");
			
			frase = entrada.nextLine();
			
			
		}
		System.out.println("Você quis sair do programa.");
		entrada.close();
		
	
	}

}
