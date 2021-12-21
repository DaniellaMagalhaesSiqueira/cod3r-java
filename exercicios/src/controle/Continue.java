package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i<10;i++ ){
			if(i%2==1){
				continue;//todos os valores pares serão impressos
				//continue interrompe apenas a iteração em questão
			}
			System.out.println(i);
		}
	}
}
