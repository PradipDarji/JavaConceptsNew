package OOPSConcepts.Constructor;

public class ConstructorConcept01 {

    String employeeName;
    int employeeAge;
    int employeeExperience;

    ConstructorConcept01(String employeeName, int employeeAge, int employeeExperience){
        employeeName = employeeName;
        employeeAge = employeeAge;
        employeeExperience = employeeExperience;
    }

    public void display() {
        System.out.println("Employee Name is: "+employeeName+ " && Employee Age is: "+employeeAge+ " && Employee Experience is: "+employeeExperience);
    }


    public static void main(String[] args) {
        ConstructorConcept01 cc1 = new ConstructorConcept01("Pradip",29,7);
        cc1.display();
    }

}
