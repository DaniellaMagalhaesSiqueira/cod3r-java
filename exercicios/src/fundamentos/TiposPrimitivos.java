package fundamentos;

public class TiposPrimitivos {
	public static void main(String[]args){
		//informações de um funcionário
		//variáveis não utilizadas ficam em destaque
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3234845223L;// quando passa de 2 bilhões tem que ser long e ter um L no final
		
		//Tipos numéricos reais
		float salario = 11455.44F; // F no final de float
		double vendasAcumuladas = 2991797103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere
		char status = 'a'; // ativo
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		
		System.out.println(pontosAcumulados/vendasAcumuladas);
		System.out.println(id + ": ganha -> "+ salario + "reais");
		System.out.println(	"Férias? "+ estaDeFerias);
		System.out.println(	"Status: "+ status);
		
		
		
	}
}
