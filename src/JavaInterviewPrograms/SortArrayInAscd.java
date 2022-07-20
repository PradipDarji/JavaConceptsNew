package JavaInterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInAscd {
    public static void main(String[] args) {
        Integer[] age = {10, 15, 26, 45, 75, 36, 85, 12, 56};
        Arrays.sort(age);
        System.out.println("sorted Array ::"+Arrays.toString(age));

        Arrays.sort(age, Collections.reverseOrder());

        System.out.printf("Modified arr[] : %s",Arrays.toString(age));
    }

}
