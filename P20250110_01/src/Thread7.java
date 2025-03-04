
public class Thread7 extends Thread{
	public void run() {
		System.out.println("Lo stato del Thread: " + this.getState());
	}
	
	public static void main(String[] args) {
		Thread7 t7 = new Thread7();
		System.out.println("Lo stato del Thread: " + t7.getState());
		
		//Avvido del thread
		t7.start();
		
		t7.interrupt();
		try {
			t7.sleep(1);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Lo stato del Thread: " + t7.getState());
	}
}
