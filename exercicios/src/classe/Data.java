package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		
	}
	Data(){
	//	dia = 01;
	//	mes = 01;
	//	ano = 1970;
		this(1,1,1970);
	}
	//tipo obterData(...)
	String obterDataFormatada(){
		//return dia+"/"+mes+"/"+ano;
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}
	
	void imprimirDataFormatada(){
		System.out.println(dia+"/"+mes+"/"+ano);
	}

}
