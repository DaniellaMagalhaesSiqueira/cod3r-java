package lambdas;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
public static void main(String[] args) {

	BinaryOperator <Double> calculo = (x,y) -> {return x + y;};
	//lambda expression s� funciona com interfaces funcionais @FunctionalInterface, s�o interfaces com apenas um m�todo abstract
	System.out.println(calculo.apply(2.0,3.0));
	
	calculo = (x,y)-> x*y;
	
	System.out.println(calculo.apply(2.0,3.0));
	
	
}
}
