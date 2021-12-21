package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
//	Ana mae = new Ana(); não precisa criar uma instÂncia, pois caso contrario não recebe nada por herança
	void testeAcessos() {
//		segredo;
//		facoDentroDeCasa
//		formaDeFalar
//		todosSabem;
//		System.out.println(mae.segredo);//não consigo acessar pq é privado
//		System.out.println(mae.facoDentroDeCasa);//não está no mesmo pacote
		System.out.println(formaDeFalar);//acesso via herança
		System.out.println(todosSabem);
	}
}
