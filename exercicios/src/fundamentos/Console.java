package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[]args){
		
		System.out.print("Bom");
		System.out.print(" dia.\n");
		System.out.println("Bom");
		System.out.println(" dia.");
//java 10		System.out.printf("Megasena: %d %d %d %d %d %d",1,2,3,4,5,6);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome aqui: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome aqui: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome: "+ nome+" "+sobrenome +"e idade: "+idade);
		
		entrada.close();
		
		
	}

}
