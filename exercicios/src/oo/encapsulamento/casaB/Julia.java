package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
//		segredo;
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem;
//		System.out.println(sogra.segredo);//n�o consigo acessar pq � privado
//		System.out.println(sogra.facoDentroDeCasa);//n�o tem rela��o do pacote
//		System.out.println(sogra.formaDeFalar);//n�o tem heran�a
		System.out.println(sogra.todosSabem);//s� o que � publico
		
	}
}
