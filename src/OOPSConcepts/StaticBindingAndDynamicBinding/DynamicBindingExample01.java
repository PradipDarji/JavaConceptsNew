package OOPSConcepts.StaticBindingAndDynamicBinding;

public class DynamicBindingExample01 {

    public void animal(){
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        DynamicBindingExample01 sb01 = new DynamicBindingExample01();
        sb01.animal();
    }
}
