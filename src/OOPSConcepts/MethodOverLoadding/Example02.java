package OOPSConcepts.MethodOverLoadding;

public class Example02 {

    public void test(int a, int b) {
        System.out.println("Number of parameter is 2 in integer");
    }

    public void test(float a, float b) {
        System.out.println("Number of parameter is 2 in float");
    }

    public void test(double a, double b) {
        System.out.println("Number of parameter is 2 in double");
    }

    public static void main(String[] args) {
        Example02 ex01 = new Example02();
        ex01.test(10, 20);
        ex01.test(10f, 20f);
        ex01.test(10.25, 20.26);
    }
}
