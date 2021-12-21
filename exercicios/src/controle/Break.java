package controle;
//o break pode ser aplicado ao for e ao while também.
public class Break {
	public static void main(String[] args) {
		for(int i =0; i<10; i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!!!");
	}

}
