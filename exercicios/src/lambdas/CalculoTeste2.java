package lambdas;

public class CalculoTeste2 {
public static void main(String[] args) {
	Calculo calculo = (x,y) -> {
		return x + y; //lambda expression s� funciona com interfaces funcionais @FunctionalInterface, s�o interfaces com apenas um m�todo abstract
	};
	
	System.out.println(calculo.executar(2,3));
	
	calculo = (x,y)-> x*y;
	
	System.out.println(calculo.executar(2,3));
	
	System.out.println(calculo.legal());
	System.out.println(Calculo.muitoLegal());
}
}
