package lambdas;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
public static void main(String[] args) {

	BinaryOperator <Double> calculo = (x,y) -> {return x + y;};
	//lambda expression só funciona com interfaces funcionais @FunctionalInterface, são interfaces com apenas um método abstract
	System.out.println(calculo.apply(2.0,3.0));
	
	calculo = (x,y)-> x*y;
	
	System.out.println(calculo.apply(2.0,3.0));
	
	
}
}
