package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos alunos?");
		int qtdeAlunos = entrada.nextInt();
		System.out.print("Quantas notas por aluno?");
		int qtdeNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double [qtdeAlunos] [qtdeNotas];
		double total = 0;
		for (int a =0; a<notasDaTurma.length;a++){//a de aluno
			for(int n = 0; n<notasDaTurma[a].length; n++){//n de nota
				System.out.print("Informe a nota " + (n+1) + " do aluno "+ (a+1));
				notasDaTurma[a][n] = entrada.nextDouble();
				total+= notasDaTurma[a][n];
				
			}
		}
		double media = total/(qtdeAlunos*qtdeNotas);
		System.out.println("A média da turma é: " + media);
		for(double [] notasDoAluno: notasDaTurma){
			
		System.out.println(Arrays.toString(notasDoAluno));
		}
		entrada.close();
	}
}
