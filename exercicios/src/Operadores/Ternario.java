package Operadores;

public class Ternario {
	public static void main(String[]args){
		double media = 5.0;
		String recuperacao = media >= 5.0 ? "em recuperação.": "reprovado.";
		String resultado = media >= 7.0 ? "aprovado.":recuperacao;
		System.out.println("O aluno está "+ resultado);
		//são três operandos, a comparação da média e a condição com dois resultados.
		
	}

}
