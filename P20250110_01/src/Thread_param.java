public class Thread_param implements Runnable {
    private Boolean param;

    public Thread_param(Boolean param) {
        this.param = param;
    }

    @Override
    public void run() {
        if (param) {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread " + Thread.currentThread().getName() + " - Numero: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrotto");
                }
            }
        } else {
            for (int i = 100; i >= 90; i--) {
                System.out.println("Thread " + Thread.currentThread().getName() + " - Numero: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrotto");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread_param(true), "T1");
        Thread t2 = new Thread(new Thread_param(false), "T2");
        
        t1.start();
        t2.start();
    }
}