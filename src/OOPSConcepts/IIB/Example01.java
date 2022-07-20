package OOPSConcepts.IIB;

public class Example01 {
    int speed;
    Example01(){
        System.out.println("Constructor calling.....");
    }
    {
        speed = 100;
        System.out.println("Instance initializer block calling.....");
    }

    public static void main(String[] args) {
        Example01 ex01 = new Example01();
    }

}
