package JavaInterviewPrograms;

public class ReverseNumber {

    public static void reverseNumber(int num) {
        int res = 0;
        int r = 0;

        while (num != 0) {
            r = num % 10;
            res = (res * 10) + r;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + res);
    }

    public static void main(String[] args) {
        reverseNumber(123456789);
    }
}
