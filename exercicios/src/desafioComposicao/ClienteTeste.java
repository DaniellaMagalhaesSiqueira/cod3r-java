package desafioComposicao;

public class ClienteTeste {
	public static void main (String[]args) {
		
		Cliente cliente1 = new Cliente("Dani");
		
		Compra compra1 = new Compra();
		
		Produto prod1 = new Produto("Arroz",3.55);
		
		Produto prod2 = new Produto("Feijão", 3.80);
		
		Produto prod3 = new Produto("Alho", 1.55);
		
		Produto prod4 = new Produto ("Sal", 2.05);
		
			
		compra1.adicionarItem(5,prod3);
		compra1.adicionarItem(3,prod1);
		
		cliente1.adicionarCompra(compra1);
		double valor = compra1.obterValorTotal();
		System.out.println("O valor total da compra é: " + valor);
		
		Compra compra2 = new Compra();
		Compra compra3 = new Compra();
		compra3.adicionarItem(10,"Caneta",9.50);
		compra2.adicionarItem(2,prod4);
		compra2.adicionarItem(3,prod2);
		cliente1.adicionarCompra(compra2);
		cliente1.adicionarCompra(compra3);
		valor = cliente1.valorTotalCompras();
		System.out.println("O valor total da compra de "+cliente1.nome +" é: " + valor);
	}
}
