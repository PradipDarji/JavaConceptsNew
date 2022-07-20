package OOPSConcepts.String;

public class StringGetChars {

    public static void main(String[] args) {
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        str.getChars(6,16,ch,0);
        System.out.println(ch);
    }
}
