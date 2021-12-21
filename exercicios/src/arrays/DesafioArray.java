package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas quer colocar: ");
		
		int quantidade = entrada.nextInt();
		
		double notas [] = new double[quantidade];
		
		for (int i = 0; i < notas.length; i++){
			
			System.out.print("Digite a nota "+ (i+1)+": ");
			
			notas[i] = entrada.nextDouble();
			
		}
		double soma = 0;
		for (double nota: notas){
			soma += nota;
		}
		System.out.println("Sua média é " + soma/notas.length);
		
		
		entrada.close();
		
	}

}
