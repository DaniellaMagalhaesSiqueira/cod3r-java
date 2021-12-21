package lambdas;

public class Threads {
	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho();
		Runnable t2 = new Runnable() {
			public void run() {
				for(int i = 0; i< 100; i++) {
					System.out.println("Tarefa #02");
				}
			}
		};//classe sem nome
		
//		Runnable t3 = () -> {
//			for(int i = 0; i< 100; i++) {
//				System.out.println("Tarefa #03");
	//		}
		
		//};
		Runnable t3 = Threads::trabalho3;
		
		
		Thread trab1 = new Thread(t1);
		Thread trab2 = new Thread(t2);
		Thread trab3 = new Thread(t3);
		
		trab1.start();
		trab2.start();
		trab3.start();
		
	}
		
	
		static void trabalho3() {
			for(int i = 0; i < 100; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				}catch (Exception e) {
					
				}
			}
		}
	
		
	}

