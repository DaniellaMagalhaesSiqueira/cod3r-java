package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i<10;i++ ){
			if(i%2==1){
				continue;//todos os valores pares ser�o impressos
				//continue interrompe apenas a itera��o em quest�o
			}
			System.out.println(i);
		}
	}
}
