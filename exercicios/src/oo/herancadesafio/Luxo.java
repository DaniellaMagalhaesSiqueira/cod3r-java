package oo.herancadesafio;

public interface Luxo {
	void ligarAr();
	void desligarAr();
	default int velocidadeDoAr() {
		return 1;
	}
}
