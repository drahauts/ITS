public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread4_01());
        Thread t2 = new Thread(new Thread4_02());
        t1.start();
        t2.start();
    }
}


class Thread4_01 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Primo Thread: i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Errore nel primo thread: " + e.getMessage());
            }
        }
    }
}

// Seconda classe thread
class Thread4_02 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Secondo Thread: i = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Errore nel secondo thread: " + e.getMessage());
            }
        }
    }
}
