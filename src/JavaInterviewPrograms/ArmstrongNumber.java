package JavaInterviewPrograms;

public class ArmstrongNumber {

    public static void isArmstrongNumber(int num) {
        System.out.println("Entered number is: " + num);
        int cube = 0;
        int t;
        int r;
        t = num;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            cube = cube + (r * r * r);
        }

        if(t==cube){
            System.out.println("Entered number "+cube+" is Armstrong Number.");
        }else{
            System.out.println("Entered number "+cube+" is not Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        isArmstrongNumber(153);
    }
}
