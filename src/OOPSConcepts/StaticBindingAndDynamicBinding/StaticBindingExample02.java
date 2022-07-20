package OOPSConcepts.StaticBindingAndDynamicBinding;

public class StaticBindingExample02 extends StaticBindingExample01 {

    private void run(){
        System.out.println("StaticBindingExample02 All vehicles are running.......");
    }

    static void sum(){
        System.out.println("StaticBindingExample02 sum method.......");
    }

    /*final void test(){
        System.out.println("test method calling.........");
    }*/

    public static void main(String[] args) {
        StaticBindingExample02 sb02 = new StaticBindingExample02();
        sb02.test();
        sb02.run();
        sum();
    }
}
