package generics;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Optional;


public class Pares <C extends Number,V>{
	private final Set <Par <C,V>> itens = new LinkedHashSet<>();
	//LinkedHashSet -> no lugar de HashSet ou TreeSet e garante a ordem de inser��o
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; //vai sair do m�todo se inserir chave nula
		
		Par<C,V> novoPar = new Par<C,V> (chave, valor);
		
		if(itens.contains(novoPar)) {//cria, verifica se est� contido e remove
			itens.remove(novoPar);
		}
		itens.add(novoPar);//se n�o estiver contido sabemos que n�o haver� repetido pq j� removeu
		//ou acrescenta ou substitui
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		Optional <Par<C,V>> parOpcional =  itens.stream()
				.filter(par -> chave.equals(par.getChave()))
				.findFirst();
		return parOpcional.isPresent()? parOpcional.get().getValor() : null;
	}
	
}
