package OOPSConcepts.Super;

public class Example02 extends Example01{
    String color = "White";

    Example02(){
        super();
        System.out.println("Constructor from current class");
    }

    void test(){
        System.out.println("Method from current class");
    }

    public void display(){
        test();
        super.test();
        System.out.println("Color received from current clas: "+color);
        System.out.println("Color received from super clas: "+super.color);
    }

    public static void main(String[] args) {
        Example02 ex02 = new Example02();
        ex02.display();
    }

}
