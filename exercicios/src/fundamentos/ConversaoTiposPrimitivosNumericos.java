package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[]args){
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.12345888888888;// float não suporta
		System.out.println(b);//mas a conversão explícita (CAST) trunca o valor
		
		int c = 129;
		byte d = (byte)c;
		System.out.println(d);// resultado é truncado  -127 (CAST)
		
		
	}

}
