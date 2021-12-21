package controle;
import java.util.Scanner;
public class CalculaMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double result = (nota1+nota2)/2;
		
		if(result>=7.0){
			System.out.println("Aprovado");
		}
		if(result<=7.0 && result>=4.0){
			System.out.println("Recuperação");
		}
		if(result<=3.9){
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}
