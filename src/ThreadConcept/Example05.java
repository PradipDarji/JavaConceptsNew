package ThreadConcept;

public class Example05 extends Thread{

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Example05 ex01 = new Example05();
        ex01.start();
        ex01.start();
    }
}
