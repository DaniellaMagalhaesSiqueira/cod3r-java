package desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double valorTotalCompras() {
		double total = 0;
		
		for(Compra compraAtual: compras) {
			total += compraAtual.obterValorTotal();
		}
		return total;
	}
}
