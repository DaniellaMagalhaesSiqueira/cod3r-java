package fundamentos;

public class Inferencia {
	public static void main(String[]args){
		double a = 4.5; // declara��o e inicializa��o da variavel
		System.out.println(a);
//java 10		var b = 4.5;
		int b = 2;
		System.out.println(b);
//java 10		var c = "texto";
		String c = "texto";
		System.out.println(c);
		//c = "outro texto"
		System.out.println(c);
		//c = 4.5, infer�ncia que o valor de c � double
		
	}
}
