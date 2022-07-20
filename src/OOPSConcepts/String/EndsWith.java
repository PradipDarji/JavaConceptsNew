package OOPSConcepts.String;

public class EndsWith {
    public static void main(String[] args) {
        String name="what do you know about me";
        if(name.endsWith("e")){
            System.out.println("Inside the if block");
        }else{
            System.out.println("Inside the else block");
        }

        if(name.endsWith("me")){
            System.out.println("Inside the if block");
        }else{
            System.out.println("Inside the else block");
        }

        if(name.endsWith("xx")){
            System.out.println("Inside the if block");
        }else{
            System.out.println("Inside the else block");
        }

    }
}
