
public class Thread1 extends Thread{
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println("Io sono " + Thread1.class.getSimpleName() + " ed \"i\" vale " + i);
		}
	}
}


//Thread t2 = new Thread(new Thread2());
//t2.start();

//Thread t3 = new Thread(new Thread3());
//t3.start();
//
//Thread t4 = new Thread(new Thread_param(true));
//Thread t5 = new Thread(new Thread_param(false));
//t4.start();
//t5.start();