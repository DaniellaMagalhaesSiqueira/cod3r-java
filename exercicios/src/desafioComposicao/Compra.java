package desafioComposicao;

import java.util.ArrayList;

import java.util.List;

public class Compra {
	
	List <Item> itens = new ArrayList<>();
	
	void adicionarItem(int qtde, Produto p) {
		this.itens.add(new Item(qtde,p));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade*item.produto.preco;
		}

		
		return total;
	} 
	
	void adicionarItem(int quantidade, String nome, double preco) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(quantidade, produto));
	}
}
