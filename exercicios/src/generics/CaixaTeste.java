package generics;

public class CaixaTeste {
	public static void main(String[] args) {
		Caixa <String> caixaA = new Caixa<>();//defino o tipo no instanciamento
		
		caixaA.guardar("String");
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa <Integer> caixaB = new Caixa<>();
		
		caixaB.guardar(123);
		int coisaB = caixaB.abrir();
		 System.out.println(coisaB);
		
	}
}
