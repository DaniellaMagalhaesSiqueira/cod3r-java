package Operadores;

public class Ternario {
	public static void main(String[]args){
		double media = 5.0;
		String recuperacao = media >= 5.0 ? "em recupera��o.": "reprovado.";
		String resultado = media >= 7.0 ? "aprovado.":recuperacao;
		System.out.println("O aluno est� "+ resultado);
		//s�o tr�s operandos, a compara��o da m�dia e a condi��o com dois resultados.
		
	}

}
