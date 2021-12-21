package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data niver = new Data(28,10,1980);
//		niver.dia = 28;
//		niver.mes = 10;
//		niver.ano = 1980;
		
		Data hoje = new Data();
//		hoje.dia = 26;
//		hoje.mes = 01;
//		hoje.ano = 2020;
		
		System.out.println("Hoje é "  + niver.obterDataFormatada());
		hoje.imprimirDataFormatada();
	}
}
