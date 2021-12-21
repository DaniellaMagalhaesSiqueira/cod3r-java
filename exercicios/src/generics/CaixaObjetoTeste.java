package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.3); // converte automaticamente num tipo primitido double
		
		Integer coisaA = (Integer) caixaA.abrir();//n�o � um erro de compila��o, mas uma exce��o
		
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.guardar("ol�");
		
		String coisaB = (String) caixaB.abrir(); // converte automaticamente num tipo primitido double
		
		System.out.println(coisaB);
	}
}
