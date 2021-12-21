package lambdas;

public class Trabalho implements Runnable {
	public void run() {
		for(int i = 0; i< 100; i++) {
			System.out.println("Tarefa #01");
		}
	}
}
