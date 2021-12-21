package controle;

import java.util.Scanner;
//domingo  -> 1
//segunda ->  assim por diante...

public class DesafioDiaSemana {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = entrada.next();//nextLine pegaria múltiplas palavras
		
		if ("Domingo".equalsIgnoreCase(dia)){
			System.out.println("1");
		}
		else if("Segunda".equalsIgnoreCase(dia)){
			System.out.println("2");
		}
		else if("Terça".equalsIgnoreCase(dia)){
			System.out.println("3");
		}
		else if("Quarta".equalsIgnoreCase(dia)){
			System.out.println("4");
		}
		else if("Quinta".equalsIgnoreCase(dia)){
			System.out.println("5");
		}
		else if("Sexta".equalsIgnoreCase(dia)){
			System.out.println("6");
		}
		else if("Sábado".equalsIgnoreCase(dia)||"Sabado".equalsIgnoreCase(dia)){
			System.out.println("7");
		}
		
		
		entrada.close();
	}

}
