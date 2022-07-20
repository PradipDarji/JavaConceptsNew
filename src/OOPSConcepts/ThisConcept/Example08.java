package OOPSConcepts.ThisConcept;

public class Example08 {

    // this can be used to return the current class instance from the method.
    public Example08 test01(){
        System.out.println("test01 method calling....................");
        return new Example08();
    }

    public Example08 test02(){
        System.out.println("test02 method calling....................");
        return this;
    }

    public static void main(String[] args) {
        Example08 ex08 = new Example08();
        ex08.test01();
        ex08.test02();
    }
}
