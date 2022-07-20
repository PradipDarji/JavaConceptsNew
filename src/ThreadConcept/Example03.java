package ThreadConcept;

public class Example03 {
    public static void main(String[] args) {
        Thread t1 = new Thread("My First Thread");
        t1.start();
        String s1 = t1.getName();
        System.out.println(s1);
    }
}
