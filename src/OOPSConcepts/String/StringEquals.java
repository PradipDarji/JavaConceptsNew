package OOPSConcepts.String;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Pradip";
        String s2 = new String("Pradip");
        String s3 = "Darji";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
