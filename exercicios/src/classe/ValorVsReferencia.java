package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		//atribuição por valor (tipo primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2022);
		
		Data d2 = d1;
		//atribuição por referência (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d){
		d.dia = 01;
		d.mes = 01;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a){//o que é passado para um método é uma cópia
		//cria uma cópia de a então não causa impacto
		
		a++;
	
	}

}
