package OOPSConcepts.Constructor;

public class DefaultConstructorConcept {

    /*
    Constructor:
    1. Constructor name must be same like class name
    2. Constructor should not return anything
    3. Constructor should not accept final, abstract, Synchronized
    4. Constructor default value: int 0 and String null
    */
    DefaultConstructorConcept(){
        System.out.println("Default constructor calling........");
    }

    public static void main(String[] args) {
        DefaultConstructorConcept dcc = new DefaultConstructorConcept();
    }
}
