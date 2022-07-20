package OOPSConcepts.ObjectAndClass;

public class StaticAndNonStaticConcept01 {

    static String collageName = "Shantilal Shah Engineering College";
    String studentName;
    int studentAge;

    public static void studentInfo(){
        collageName = "LD Engineering";
        System.out.println("Student college name is: "+collageName);
    }

    public void studentInfo02(){
        studentName = "Pradip";
        studentAge = 29;

        System.out.println("Student name is: "+studentName);
        System.out.println("Student Age is: "+studentAge);
    }

    public static void main(String[] args) {
        StaticAndNonStaticConcept01 staticVsNonstatic = new StaticAndNonStaticConcept01();
        // Calling Static variable by the following way
        System.out.println("***********Calling Static variable by the following way***********");
        System.out.println("College name is: "+collageName);
        System.out.println("College name is: "+staticVsNonstatic.collageName);

        // Calling Nonstatic variable by the following way
        System.out.println("***********Calling Nonstatic variable by the following way***********");
        System.out.println("College name is: "+staticVsNonstatic.studentName);

        // Calling Static method by the following way
        System.out.println("***********Calling Static method by the following way***********");
        studentInfo();
        staticVsNonstatic.studentInfo();

        // Calling Nonstatic method by the following way
        System.out.println("***********Calling Nonstatic method by the following way***********");
        staticVsNonstatic.studentInfo02();
    }
}
