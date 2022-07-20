package JavaInterviewPrograms;

public class LeapYearProgram {
    public static void isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("LEAP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }
    }

    public static void main(String[] args) {
        isLeapYear(2020);
    }
}
