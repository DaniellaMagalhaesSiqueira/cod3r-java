package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para ser o divisor: ");
		try {
			
			System.out.println(7/ entrada.nextInt());		
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally...");//Sempre será chamado
			
			entrada.close();
		}
		
		System.out.println("Fim :)");
	}
}
