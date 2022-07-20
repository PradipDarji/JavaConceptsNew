package OOPSConcepts.Inheritance;

public class Multilevel03 extends Multilevel02{

    public void test03(){
        System.out.println("test3 method from Multilevel03 class");
    }

    public static void main(String[] args) {
        Multilevel03 mo3 = new Multilevel03();
        mo3.test01();
        mo3.test02();
        mo3.test03();
    }
}
