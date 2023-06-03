package OOPSConcepts.StaticBindingAndDynamicBinding;

public class DynamicBindingExample01 {

    private void run(){
        System.out.println("StaticBindingExample01 All vehicles are running.......");
    }

    static void sum(){
        System.out.println("StaticBindingExample01 sum method.......");
    }

    final void test(){
        System.out.println("StaticBindingExample01 test method calling.........");
    }

    public static void main(String[] args) {
        DynamicBindingExample01 sb01 = new DynamicBindingExample01();
        sb01.run();
        sb01.test();
        sum();
    }
}
