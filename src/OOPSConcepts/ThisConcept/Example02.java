package OOPSConcepts.ThisConcept;

public class Example02 {

    String name;
    int age;
    // This can refer the current class instance variable
    Example02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("User name is: " + name + " && User age is: " + age);
    }

    public static void main(String[] args) {
        Example02 ex01 = new Example02("Pradip", 29);
        ex01.display();
    }
}
