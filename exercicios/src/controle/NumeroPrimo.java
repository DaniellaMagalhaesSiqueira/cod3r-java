package controle;
import java.util.Scanner;
public class NumeroPrimo {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);	
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		for(double cont=1; cont<=num; cont++){
			System.out.println(num%cont);
			if(num%cont==0&&cont!=num&&cont!=1){
				System.out.println("Não é um número primo.");
				break;
			}
			if(num%cont==0&&cont==num){
				System.out.println("É um número primo.");
				break;
			}
		}
		entrada.close();
	}
		
}
