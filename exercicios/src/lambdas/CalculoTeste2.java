package lambdas;

public class CalculoTeste2 {
public static void main(String[] args) {
	Calculo calculo = (x,y) -> {
		return x + y; //lambda expression só funciona com interfaces funcionais @FunctionalInterface, são interfaces com apenas um método abstract
	};
	
	System.out.println(calculo.executar(2,3));
	
	calculo = (x,y)-> x*y;
	
	System.out.println(calculo.executar(2,3));
	
	System.out.println(calculo.legal());
	System.out.println(Calculo.muitoLegal());
}
}
