package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaDoIntervalo extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervalo(String nomeDoAtributo){
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' est� fora do intervalo.", nomeDoAtributo);
		
	}
}
