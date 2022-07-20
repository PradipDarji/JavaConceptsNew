package OOPSConcepts.ObjectAndClass;

public class ObjectsAndClass {
    // Instance Object
    String name;
    int age;

    // Method
    public void userInfo() {
        name = "Pradip";
        age = 29;
        System.out.println("User name is: " + name + " && User age is:" + age);
    }

    // Call the method through clas object
    public static void main(String[] args) {
        ObjectsAndClass object = new ObjectsAndClass();
        object.userInfo();
    }

}
