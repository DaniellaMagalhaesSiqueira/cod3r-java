package controle;
import java.util.Scanner;
public class MaiorValor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int fixo = 0;
		for(int i =0;i<10;i++){
	
			System.out.println("Digite um número: ");
			int num = entrada.nextInt();
			if(num>fixo){
				fixo = num;
			}
			else{
				continue;
				
			}
		}
		System.out.println(fixo);
		
		
		
		
		entrada.close();
	}

}
