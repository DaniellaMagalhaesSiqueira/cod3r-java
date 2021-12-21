package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Fim :)");
	}
	//Não checada ou não verificada
	static void geraErro1() {
		//Exceção NÃO verificada
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	//Exceção verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
		//quando a exceção é checada vc precisa deixar claro na assinatura que tem uma exceção verificada
		//E podemos obrigatoriamente tratar o geraErro2
		
	}
	
	
}
