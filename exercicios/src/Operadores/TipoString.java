package Operadores;
import java.util.Scanner;

public class TipoString {
	public static void main(String[]args){
		System.out.println("2" == "2");//comparar Strings usando o símbolo de ==
		//não funcionará como desejado
		String s = new String("2");
		System.out.println("2"==s);
		System.out.println("2".equals(s));//aqui compara-se os conteúdos
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();//.next também tira os espaços em branco
		System.out.println("2" == s2.trim());//.trim tira os espaços em branco
		System.out.println("2".equals(s2.trim()));
		
		
		
		entrada.close();
		
	}
}
