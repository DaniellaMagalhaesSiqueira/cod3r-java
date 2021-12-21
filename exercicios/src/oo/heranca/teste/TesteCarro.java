package oo.heranca.teste;

import oo.herancadesafio.Carro;
import oo.herancadesafio.Civic;
import oo.herancadesafio.Ferrari;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		c1.acelerar();
		c1.acelerar();
		
		Ferrari c2 = new Ferrari(400);
		c2.acelerar();
		c2.ligarTurbo();
		c2.frear();
		c2.acelerar();
		
		System.out.println(c2.velocidadeDoAr());
		c2.frear();
		c2.ligarAr();
		c2.acelerar();
	
		
		System.out.println(c1.toString() + c2.toString());
	}
}
