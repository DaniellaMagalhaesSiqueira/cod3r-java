package oo.composicao;

import java.util.ArrayList;

public class Compra { //relação 1 para n, uma compra tem muitos itens, um item tem uma compra
	
	String cliente;
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item:itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
