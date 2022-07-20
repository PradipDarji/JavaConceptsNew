package JavaInterviewPrograms;

public class EvenOrOddNumber {
    public static void isEvenOrOddNumber(int num){
        System.out.println("Entered number is "+num);
        if(num%2==0){
            System.out.println("Entered number "+num+" is even.");
        }else{
            System.out.println("Entered number "+num+" is odd.");
        }
    }
    public static void main(String[] args) {
        isEvenOrOddNumber(10);
    }
}
