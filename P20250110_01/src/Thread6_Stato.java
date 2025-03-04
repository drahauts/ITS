import java.util.*;

public class Thread6_Stato extends Thread{
	public void run() {
		System.out.println("Nome: [" + this.getName() +"],"
				+ " Stato: [" + this.getState() + "]");
	}
	
	
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	Thread6_Stato t6 = new Thread6_Stato();
    	Thread6_Stato t61 = new Thread6_Stato();
    	System.out.println("Inserisci il nome per il primo Thread: ");
    	String nome1 = scanner.nextLine();

    	System.out.println("Inserisci il nome per il secondo Thread: ");
    	String nome2 = scanner.nextLine();

    	t6.setName(nome1);
    	t6.start();
    	

    	t61.setName(nome2);
    	t61.start();
    }
}