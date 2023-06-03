package OOPSConcepts.Static;

public class StaticConcept {
    int age = 26;
    String name = "Vishu";
    static String collegeName;

    static {
        collegeName = "SSEC";
        System.out.println("College name is: "+collegeName);
    }

    public static void userName01(int age,String name){
        System.out.println("User name is: "+name+" && User age is: "+age);
    }

    public void userName02(int age,String name){
        System.out.println("User name is: "+name+" && User age is: "+age);
    }

    public static void userName03(int age,String name){
        userName01(23,"Pradip");
        System.out.println("User name is: "+name+" && User age is: "+age);
    }

    public void nonStaticMethodCalling(){
        userName01(25,"RRRR");
        this.userName02(55,"QA Engineer");
    }

    public static void staticMethodCalling(){
        userName01(25,"RRRR");
    }

    public static void main(String[] args) {
        StaticConcept sc = new StaticConcept();
        System.out.println(sc.age);
        System.out.println(sc.name);
        System.out.println(collegeName);
        userName01(30,"Pradip");
        sc.userName02(62,"Ashok");

    }
}
