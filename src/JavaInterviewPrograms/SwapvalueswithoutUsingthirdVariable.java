package JavaInterviewPrograms;

public class SwapvalueswithoutUsingthirdVariable {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;

        a = a + b;
        System.out.println("Value of a is: " + a);
        b = a - b;
        System.out.println("Value of a is: " + b);
        a = a - b;
        System.out.println("Value of a is: " + a);
    }
}
