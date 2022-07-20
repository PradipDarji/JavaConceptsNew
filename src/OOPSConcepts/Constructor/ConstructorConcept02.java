package OOPSConcepts.Constructor;

public class ConstructorConcept02 {

    String employeeName;
    int employeeAge;
    int employeeExperience;

    ConstructorConcept02(String employeeName, int employeeAge, int employeeExperience){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeExperience = employeeExperience;
    }

    public void display() {
        System.out.println("Employee Name is: "+employeeName+ " && Employee Age is: "+employeeAge+ " && Employee Experience is: "+employeeExperience);
    }


    public static void main(String[] args) {
        ConstructorConcept02 cc1 = new ConstructorConcept02("Pradip",29,7);
        cc1.display();
    }

}
