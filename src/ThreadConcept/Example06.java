package ThreadConcept;

public class Example06 extends Thread{

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Example06 ex01 = new Example06();
        Example06 ex02 = new Example06();
        Example06 ex03 = new Example06();

        System.out.println("Priority of the thread th1 is : " + ex01.getPriority());
        System.out.println("Priority of the thread th1 is : " + ex02.getPriority());
        System.out.println("Priority of the thread th1 is : " + ex03.getPriority());

        ex01.setPriority(6);
        ex02.setPriority(3);
        ex03.setPriority(9);

        System.out.println("Priority of the thread th1 is : " + ex01.getPriority());
        System.out.println("Priority of the thread th1 is : " + ex02.getPriority());
        System.out.println("Priority of the thread th1 is : " + ex03.getPriority());

        //ex01.start();
    }
}
