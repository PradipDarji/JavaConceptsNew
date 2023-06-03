package OOPSConcepts.StaticBindingAndDynamicBinding;

public class StaticBindingExample01 {

    public void animal(){
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        StaticBindingExample01 sb01 = new StaticBindingExample01();
        sb01.animal();
    }
}
