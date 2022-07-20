package OOPSConcepts.Inheritance;

public class Hierarchical02 extends Hierarchical01 {

    public void test02(){
        System.out.println("test02 method calling.........");
    }

    public static void main(String[] args) {
        Hierarchical02 h02 = new Hierarchical02();
        h02.test01();
        h02.test02();
    }
}
