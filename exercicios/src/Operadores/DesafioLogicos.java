package Operadores;

public class DesafioLogicos {
	public static void main(String[]args){
		//Trabalho na terça (V ou F)
		//e um trabalho na quinta (V ou F)
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean tv50 = trabalho1 && trabalho2;

		System.out.println("Comprou uma televisão de 50\"?"+ tv50);
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou uma televisão de 32\"?" + tv32);
		boolean sorvete = trabalho1 || trabalho2;
		System.out.println("A família tomou sorvete?" + sorvete);
		boolean casa = !sorvete;
		System.out.println("A família ficou em casa? " + casa);
		
		
	}
}
