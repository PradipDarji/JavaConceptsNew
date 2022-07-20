package BasicJavaConcept;

public class JavaVariables {
    int x;

    public static void main(String[] args) {
        JavaVariables jv = new JavaVariables();
        jv.sum();
    }

    public void sum() {
        int y = 50;
        int z = 60;
        x = y + z;
        System.out.println("value of X is: " + x);
    }
}
