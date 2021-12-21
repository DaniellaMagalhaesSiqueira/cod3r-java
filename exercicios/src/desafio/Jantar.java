package desafio;


public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Dani", 70.0);
		
		Pessoa p2 = new Pessoa("Márcia", 71.0);
		
	//	System.out.println(p1.nome + p2.nome + p1.peso + p2.peso);
		
		Comida c1 = new Comida("feijao",0.233);
		
		Comida c2 = new Comida("arroz", 0.300);
		
		p1.comer(c1);
		p2.comer(c2);
	
		System.out.println(p1.apresentar() +"\n"+p2.apresentar() );
		
			
	}

}
