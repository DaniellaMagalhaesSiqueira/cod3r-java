package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.3); // converte automaticamente num tipo primitido double
		
		Integer coisaA = (Integer) caixaA.abrir();//não é um erro de compilação, mas uma exceção
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.guardar("olá");
		
		String coisaB = (String) caixaB.abrir(); // converte automaticamente num tipo primitido double
		
		System.out.println(coisaB);
	}
}
