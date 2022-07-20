package OOPSConcepts.String;

public class StringCharAt {

    public static void main(String[] args) {
        String s1 = "JAVATPOINTS";
        int s2 = s1.length();
        char chr = s1.charAt(3);
        System.out.println(chr);

        // Fetching first character
        System.out.println("Character at 0 index is: "+ s1.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ s1.charAt(s2-1));

        //Print Characters Presented at Odd Positions by Using the charAt() Method
        String str = "Welcome to Javatpoint portal";
        for(int i = 0; i<=str.length()-1;i++){
            if(i%2!=0){
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }

        //Print Characters Presented at even Positions by Using the charAt() Method
        String str01 = "Welcome to Javatpoint portal";
        for(int i = 0; i<=str01.length();i++){
            if(i%2==0){
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }

        // StringIndexOutOfBoundsException
        char chr2 = s1.charAt(15);
        System.out.println(chr2);

    }
}
