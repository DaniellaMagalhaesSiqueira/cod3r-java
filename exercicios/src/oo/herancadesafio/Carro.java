package oo.herancadesafio;

public class Carro {
	
	 public final int VELOCIDADE_MAXIMA;
	 protected int velocidade = 60;
	 private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		}else {
		this.velocidade += getDelta();
		}
	}
	
	public void frear() {
		if(this.velocidade>=5) {
			this.velocidade -= 5;
		}else {
			velocidade = 0;
		}
	}
	
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "Velocidade atual é "+velocidade +"Km/h.\n";
	}
}
