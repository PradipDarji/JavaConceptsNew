package OOPSConcepts.Interface;

public class Class01 implements Interface01{
    @Override
    public void test1() {
        System.out.println("Test1 method calling............");
    }

    @Override
    public void test2() {
        System.out.println("Test2 method calling............");
    }

    public static void main(String[] args) {
        Class01 c01 = new Class01();
        c01.test1();
        c01.test2();
    }
}
