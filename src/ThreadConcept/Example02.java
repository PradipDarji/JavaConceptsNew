package ThreadConcept;

public class Example02 implements Runnable{

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Example02 ex01 = new Example02();
        Thread t1 =new Thread(ex01);
        t1.start();
    }
}
