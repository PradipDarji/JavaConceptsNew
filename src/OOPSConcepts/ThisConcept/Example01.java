package OOPSConcepts.ThisConcept;

public class Example01 {

    String name;
    int age;

    Example01(String name, int age) {
        name = name;
        age = age;
    }

    public void display() {
        System.out.println("User name is: " + name + " && User age is: " + age);
    }

    public static void main(String[] args) {
        Example01 ex01 = new Example01("Pradip", 29);
        ex01.display();
    }
}
