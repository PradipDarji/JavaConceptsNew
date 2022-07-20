package OOPSConcepts.String;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Pradip";
        String s2 = "Darji";

        s1.concat(s2);
        System.out.println(s1);
        s1 = s1.concat(s2);
        System.out.println(s1);
    }
}
