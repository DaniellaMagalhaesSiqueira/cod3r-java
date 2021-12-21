package fundamentos;

public class Temperatura {
	public static void main(String[]args){
		//(°F - 32) * 5/9 = °C
		final double AJUSTE = 32.0;
		final double FATOR = 5.0/9.0;
		double fahrenheit = 10.0;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Para 10°F temos "+ celcius +"°C");
		fahrenheit = 80.0;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Já para 80°F temos "+ celcius + "°C");
				
	}
}
