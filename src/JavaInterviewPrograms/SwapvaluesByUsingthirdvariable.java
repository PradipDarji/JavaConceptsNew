package JavaInterviewPrograms;

public class SwapvaluesByUsingthirdvariable {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;
        int temp;

        temp = a;
        System.out.println("Value of temp is: " + temp);

        a = b;
        System.out.println("Value of a is: " + a);

        b = temp;
        System.out.println("Value of b is: " + b);
    }
}
