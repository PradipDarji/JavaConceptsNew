package OOPSConcepts.ThisConcept;

public class Example05 {

    // Pass argument in method
    public void test01(Example05 ex05){
        System.out.println("test01 Pass as a argument in method.............");
    }

    public void test02(){
        // Calling method by following the way
        this.test01(this);

        // Calling method by following the way
        test01(this);
        System.out.println("test02 method calling.............");
    }

    public static void main(String[] args) {
        Example05 ex005 = new Example05();
        ex005.test02();
    }
}
