package OOPSConcepts.Interface;

public interface Interface05 {
    int i = 50;
    default void test1(){
        System.out.println("Interface default method calling........");
    }
    static void test2(){
        System.out.println("Static default method calling........");
    }
}
