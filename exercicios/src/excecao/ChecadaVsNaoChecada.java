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
	//N�o checada ou n�o verificada
	static void geraErro1() {
		//Exce��o N�O verificada
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	//Exce��o verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02");
		//quando a exce��o � checada vc precisa deixar claro na assinatura que tem uma exce��o verificada
		//E podemos obrigatoriamente tratar o geraErro2
		
	}
	
	
}
