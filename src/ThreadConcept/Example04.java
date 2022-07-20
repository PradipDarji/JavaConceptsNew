package ThreadConcept;

public class Example04 implements Runnable{

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Runnable r1 = new Example04();
        Thread t1 = new Thread(r1,"My First Thread");
        t1.start();
        System.out.println(t1.getName());
    }
}
