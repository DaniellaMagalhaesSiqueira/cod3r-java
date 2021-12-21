package generics;

public class Caixa <T>{//letras que reperentam um tipo genérico que não será definido na classe
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
	
}
