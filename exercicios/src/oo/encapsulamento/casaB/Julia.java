package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
//		segredo;
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem;
//		System.out.println(sogra.segredo);//não consigo acessar pq é privado
//		System.out.println(sogra.facoDentroDeCasa);//não tem relação do pacote
//		System.out.println(sogra.formaDeFalar);//não tem herança
		System.out.println(sogra.todosSabem);//só o que é publico
		
	}
}
