package OOPSConcepts.Inheritance;

public class Hierarchical03 extends Hierarchical01 {

    public void test03(){
        System.out.println("test03 method calling.........");
    }

    public static void main(String[] args) {
        Hierarchical03 h03 = new Hierarchical03();
        h03.test01();
        h03.test03();
    }
}
