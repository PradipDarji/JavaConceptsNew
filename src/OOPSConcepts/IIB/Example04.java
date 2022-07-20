package OOPSConcepts.IIB;

public class Example04 {
    {
        System.out.println("Instance initializer block first calling............");
    }
    {
        System.out.println("Instance initializer block second calling............");
    }
    {
        System.out.println("Instance initializer block third calling............");
    }
    {
        System.out.println("Instance initializer block fourth calling............");
    }

    public static void main(String[] args) {
        Example04 ex04 = new Example04();
        Example04 ex044 = new Example04();
    }
}
