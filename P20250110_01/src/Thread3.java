public class Thread3 implements Runnable {
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println("Contatore uguale = " + i);
		}
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println("Qualcosa...");
		}
	}
	public static void main(String[] args) {
		Thread t3 = new Thread(new Thread3());
		Thread t4 = new Thread(new Thread3());
		t3.start();
		t4.start();
	}
}
