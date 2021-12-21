package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		/*CaixaNumero <String> caixa = new CaixaNumero<>();
		caixaA.guardar("Teste");*/
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(2.56678);
		Double coisa = caixaA.abrir();
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(256678);
		Integer coisaB = caixaB.abrir();
		
		System.out.println(coisa);
		System.out.println(coisaB);
		
	}
}
