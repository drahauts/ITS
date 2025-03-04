public class Thread2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Sono un thread Runnable");
	}
	public Thread2() {
		super();
	}
	public static void main(String[] args) {		
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}
}
