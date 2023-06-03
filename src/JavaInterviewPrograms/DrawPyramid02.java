package JavaInterviewPrograms;

public class DrawPyramid02 {
    public static void main(String[] args) {
        int count = 6;
        for (int i = 1; i <= count; i++) {
            for (int j = count; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
