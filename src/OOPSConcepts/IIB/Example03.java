package OOPSConcepts.IIB;

public class Example03 extends Example02{

    Example03(){
        System.out.println("Child class constructor calling.....");
    }
    {
        System.out.println("Child class instance initializer block calling.....");
    }

    public static void main(String[] args) {
        Example03 ex03 = new Example03();
    }
}
