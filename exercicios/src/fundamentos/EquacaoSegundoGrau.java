package fundamentos;

public class EquacaoSegundoGrau {
	public static void main(String[]args){
		
		int a = 1;
		int b = 12;
		int c= -13;
		
		double baskara1 = (b + (Math.sqrt((Math.pow(b,2))- 4*a*c)))/2*a;
		double baskara2 = (b - (Math.sqrt((Math.pow(b,2))- 4*a*c)))/2*a;
		
		System.out.println("As raízes da equação são "+baskara1+" e "+baskara2);
		
		
	}

}
