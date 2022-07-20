package OOPSConcepts.Encapsulation;


public class Example02 {

    public static void main(String[] args) {
        Example01 ex01 = new Example01();
        ex01.setUserName("QA");
        System.out.println(ex01.getUserName());
        ex01.setAge(16);
        System.out.println(ex01.getAge());

    }
}
