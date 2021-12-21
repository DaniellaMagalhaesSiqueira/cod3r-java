package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 5;
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(10));
	}

}
