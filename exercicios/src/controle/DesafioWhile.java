package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		int contador = 0;
		
		while(nota!=-1){
			
			System.out.println("Digite a nota");
			
			nota = entrada.nextDouble();
			
			if(nota<=10&&nota>=0){
				total += nota;
				contador++;}
			else if(nota != -1){
				System.out.println("Nota inválida.");
			}
			
		}
		System.out.println("Sua média é "+ total/contador);
		System.out.println("A quantidade de notas foi "+contador);
		
		entrada.close();
	}

}
