package JavaInterviewPrograms;

import java.util.Arrays;

public class FindArrayNumber {
    public static void main(String[] args) {
        System.out.println("*****************************************************************************");
        int age[] = {10, 15, 26, 45, 75, 36, 85, 12, 56};
        int size = age.length;
        Arrays.sort(age);
        System.out.println("sorted Array :: " + Arrays.toString(age));
        int res = age[size - 2];
        System.out.println("2nd largest element is ::" + res);
        System.out.println("*****************************************************************************");
        int temp, size01;
        size01 = age.length;
        for (int i = 0; i < age.length; i++) {
            for (int j = i + 1; j < age.length; j++) {
                if (age[i] > age[j]) {
                    temp = age[i];
                    age[i] = age[j];
                    age[j] = temp;
                }

            }
        }
        System.out.println("Second largest number is:: " + age[size01 - 2]);
    }
}
