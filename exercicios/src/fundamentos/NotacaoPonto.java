package fundamentos;

public class NotacaoPonto {
	public static void main(String[]args){

		//Esta variável não é um tipo primitivo - String com S maiúsculo
		String s = "Bom dia, X!";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!!!");
		System.out.println(s);
		System.out.println("Dani".toUpperCase());
	}

}
