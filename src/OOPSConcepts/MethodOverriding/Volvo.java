package OOPSConcepts.MethodOverriding;

public class Volvo extends Vehicle {
    void run() {
        System.out.println("Volvo is running");
    }

    public static void main(String[] args) {
        Volvo vo = new Volvo();
        vo.run();
    }
}
