package JavaInterviewPrograms;

public class ArrayPresentOnOddNumber {
    public static void main(String[] args) {
        int age[] = {10, 52, 23, 56, 74, 28};
        for (int i = 1; i < age.length; i = i + 2) {
            System.out.println(age[i]);
        }
    }
}
