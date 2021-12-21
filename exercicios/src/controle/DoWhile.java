package controle;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[]args){
		
		//estrutura:  do{} while(...);
		//será executada apenas uma vez
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		do {
		
			System.out.println("Você precisa falar"
					+ " as palavras mágicas...");
			System.out.println("Quer sair?");
			
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("Por favor"));

		System.out.println("Obrigada!");
		entrada.close();
		
		
	}

}
