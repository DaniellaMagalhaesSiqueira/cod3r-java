package controle;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[]args){
		
		//estrutura:  do{} while(...);
		//ser� executada apenas uma vez
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		do {
		
			System.out.println("Voc� precisa falar"
					+ " as palavras m�gicas...");
			System.out.println("Quer sair?");
			
			texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("Por favor"));

		System.out.println("Obrigada!");
		entrada.close();
		
		
	}

}
