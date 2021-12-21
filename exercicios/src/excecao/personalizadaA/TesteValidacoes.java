package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);//teste com string vazia e nota negativa
			
			Validar.aluno(aluno);
			
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			
			System.out.println(e.getMessage());
			
		} catch (NumeroForaDoIntervalo | IllegalArgumentException e) { // ou catch(RuntimeException
		
		System.out.println(e.getMessage());
	}// ou assim catch (StringVaziaException | NumeroForaDoIntervalo e) 
		
		System.out.println("Fim :)");
		
	}
}
