package JavaInterviewPrograms;

public class SumOfArrays {
    public static void main(String[] args) {
        int age[] = {10, 15, 26, 45, 75, 36, 85, 12, 56};
        int sum = 0;
        for(int i = 0; i<age.length;i++){
          sum  = sum+age[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}
