package controle;
import java.util.Scanner;
public class AnoBissexto {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um ano: ");
		int ano = entrada.nextInt();
		
		if (ano%4==0){
			if (ano%400==0 || !(ano%100==0)){
				System.out.println("� um ano bissexto.");}
			}
		else{
			System.out.println("Esse n�o � um ano bissexto.");}			
		
		System.out.println("Fim");
		entrada.close();
	}
}

