package controle;
import java.util.Scanner;
public class ExercicioVerificaNum {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = entrada.nextInt();
		
			if (num>=0 && num <=10){
			System.out.println("Este n�mero esta entre 0 e 10.");}
		
			if (num%2==0){
			System.out.println("Este n�mero � par");}
		
		System.out.println("Fim.");
		
		entrada.close();
	}

}
