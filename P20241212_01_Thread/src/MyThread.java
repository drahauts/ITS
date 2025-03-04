import java.time.LocalTime;

public class MyThread extends Thread {
    private long num;

//    public void run() {
//        while (num-- > 0) {
//            System.out.println("Thread id: " + getId() + ". Num: " + num);
//        }
//}
    
    while(true) {
    	System.out.println(LocalTime.now());
    	try {
    		Thread.sleep(1000);
    	}
    }

    public MyThread(long num) {
        super();
        this.num = num;
    }
}