package OOPSConcepts.ThisConcept;

public class Example03 {

    // Invoke the current class method

    public void test01(){
        System.out.println("test01 method calling...............");
    }
    public void test02(){
        this.test01();
        System.out.println("test02 method calling...............");
    }

    public static void main(String[] args) {
        Example03 ex03 = new Example03();
        ex03.test02();
    }
}
