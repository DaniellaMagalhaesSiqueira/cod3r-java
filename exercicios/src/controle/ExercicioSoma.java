package controle;
import java.util.Scanner;
public class ExercicioSoma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 1;
		int soma = 0;
		while(num>0){
			System.out.println("Insira um número positivo "
				+ "para somar e um negativo para sair: ");
			num = entrada.nextInt();
			if(num<0){
				continue;
			}
			soma += num;
			
		}
		System.out.println(soma);
		entrada.close();
	}
}
