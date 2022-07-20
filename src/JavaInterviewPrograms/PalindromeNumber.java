package JavaInterviewPrograms;

public class PalindromeNumber {

    public static void isPalindromeNumber(int num) {
        int sum = 0;
        int r = 0;
        int t;
        t = num;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if(t==sum){
            System.out.println("Entered number "+sum+" is Palindrome Number.");
        }else{
            System.out.println("Entered number "+sum+" is not Palindrome Number.");
        }
    }

    public static void main(String[] args) {
        isPalindromeNumber(181);
    }
}
