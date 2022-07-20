package ThreadConcept;

public class Example01 extends Thread{

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Example01 ex01 = new Example01();
        ex01.start();
    }
}
