package generics;

import java.util.List;

public class ListaUtil {
	
	
	public static Object getUltimo1(List<?> lista) {//pode colocar ao inv�s de ? por vazio, tamb�m pode ter dentro um extends Object ou Cliente ou Produto...
		
		return lista.get(lista.size()-1);
	}
	public static <T> T getUltimo2(List<T> lista) {
		
		return lista.get(lista.size()-1);
	}
	
	public static <A, B, C> C teste(A paramA, B paramB){
		C teste = null;
		return teste;
	}
}
