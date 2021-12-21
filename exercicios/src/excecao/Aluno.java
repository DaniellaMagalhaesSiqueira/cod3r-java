package excecao;

public class Aluno {
	public final String nome;
	public final double nota;
	public boolean bomComportamento;
	
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean bc) {
		//super();
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bc;
	}
	
	public String toString() {
		return nome + " tem nota: "+nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bomComportamento ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	
	
	
	
	
	
	
}
