package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[]args){
		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.12345888888888;// float n�o suporta
		System.out.println(b);//mas a convers�o expl�cita (CAST) trunca o valor
		
		int c = 129;
		byte d = (byte)c;
		System.out.println(d);// resultado � truncado  -127 (CAST)
		
		
	}

}
