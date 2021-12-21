package oo.herancadesafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(315);//nesse caso chamando o this vc pode ter outros tipos de inicialização como o de baixo
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr){
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {			
			return 15;
		}
	}
	
//	@Override   //valida a sobrescrição do método.
//	void acelerar() {
//		this.velocidade += 15;
//		
//	}
	
	
	@Override

	public void frear() {
		if(this.velocidade >= 15) {
			this.velocidade -= 15;
		}else {
			this.velocidade = 0;
		}
	}
	
	
}
