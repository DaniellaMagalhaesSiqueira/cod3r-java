package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
//	Ana mae = new Ana(); n�o precisa criar uma inst�ncia, pois caso contrario n�o recebe nada por heran�a
	void testeAcessos() {
//		segredo;
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem;
//		System.out.println(mae.segredo);//n�o consigo acessar pq � privado
//		System.out.println(mae.facoDentroDeCasa);//n�o est� no mesmo pacote
		System.out.println(formaDeFalar);//acesso via heran�a
		System.out.println(todosSabem);
	}
}
