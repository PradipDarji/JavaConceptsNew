package OOPSConcepts.ObjectAndClass;

public class StaticBlock {

    /* Is used to initialize the static data member.
       It is executed before the main method at the time of classloading.
    */

    static int age;
    static {
        age = 50;
        System.out.println("Static block calling.................");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(age);
    }
}
