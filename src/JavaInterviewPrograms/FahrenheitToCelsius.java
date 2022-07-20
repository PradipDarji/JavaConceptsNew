package JavaInterviewPrograms;

public class FahrenheitToCelsius {

    public static void celsiusCalculation(int temprature){
        temprature = ((temprature-32)*5)/9;
        System.out.println(temprature);
    }

    public static void main(String[] args) {
        celsiusCalculation(105);
    }
}
