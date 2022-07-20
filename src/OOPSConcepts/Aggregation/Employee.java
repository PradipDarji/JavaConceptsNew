package OOPSConcepts.Aggregation;

public class Employee {
    String Name;
    int age;
    Address address;

    Employee(String Name, int age, Address address) {
        this.Name = Name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.println("My Name is " + Name + " and I am " + age + " Year Old.");
        System.out.println("I am from "+address.city+", " +address.State);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Address add =  new Address("Surat", "Gujarat");
        Employee emp = new Employee("Pradip", 29, add);
        emp.display();
    }
}
