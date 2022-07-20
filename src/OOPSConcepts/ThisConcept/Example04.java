package OOPSConcepts.ThisConcept;

public class Example04 {

    // Invoke the current class constructor
    Example04(int age){
        System.out.println("User age is: "+age);
    }

    Example04(String name){
        this(29);
        System.out.println("User name is: "+name);
    }

    public static void main(String[] args) {
        Example04 ex04 = new Example04("Pradip");
    }
}
