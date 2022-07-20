package OOPSConcepts.MethodOverLoadding;

public class Example01 {

    public void test(int a, int b) {
        System.out.println("Number of parameter is 2");
    }

    public void test(int a, int b, int c) {
        System.out.println("Number of parameter is 3");
    }

    public void test(int a, int b, int c, int d) {
        System.out.println("Number of parameter is 4");
    }

    public static void main(String[] args) {
        Example01 ex01 = new Example01();
        ex01.test(10, 20);
        ex01.test(10, 20, 30);
        ex01.test(10, 20, 30, 40);
    }
}
