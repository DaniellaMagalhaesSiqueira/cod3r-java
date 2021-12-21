package controle;
import java.util.Scanner;
public class ImprimeLetra {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = entrada.next();
		
		int letras = palavra.length();
		
		for (int cont = 0; cont< letras; cont++){
			
			System.out.println(palavra.charAt(cont));
		}
		
		
		
		entrada.close();
	}
}
