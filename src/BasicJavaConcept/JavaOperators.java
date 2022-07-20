package BasicJavaConcept;

public class JavaOperators {

    /*1. Unary Operator*/
    int a = 10;
    int b = 5;
    int c;
    int d = 10;

    public static void main(String[] args) {
        JavaOperators jo = new JavaOperators();
        jo.arithmeticOperator();
        jo.assignmentOperator();
        jo.bitwiseOperator();
        jo.ternaryOperator();
        jo.relationalOperator();
        jo.shiftOperator();
        jo.unaryOperator();
        jo.logicalOperator();
    }
    /*1. Unary Operator*/
    public void unaryOperator() {
        System.out.println("*============================Unary Operator Started===============================*");
        c = a++ + ++b;
        System.out.println("Value of C is: " + c);
        System.out.println("*============================Unary Operator End===============================*");
    }

    /*2. Arithmetic Operator*/
    public void arithmeticOperator() {
        System.out.println("*============================Arithmetic Operator Started===============================*");
        c = a + b;
        System.out.println("Value of C is: " + c);
        c = a * b;
        System.out.println("Value of C is: " + c);
        c = a % b;
        System.out.println("Value of C is: " + c);
        c = a / b;
        System.out.println("Value of C is: " + c);
        System.out.println("*============================Arithmetic Operator End===============================*");
    }

    /*3. Shift Operator*/
    public void shiftOperator() {
        System.out.println("*============================Shift Operator Started===============================*");
        c = a >> b;
        System.out.println("Value of C is: " + c);
        c = a << b;
        System.out.println("Value of C is: " + c);
        System.out.println("*============================Shift Operator End===============================*");
    }

    /*4. Logical Operator*/
    public void logicalOperator() {
        System.out.println("*============================Logical Operator Started===============================*");
        if (a > b && a > d) {
            System.out.println("Value of A is greater than b and d");
        } else {
            System.out.println("Value of A is smaller than b and d");
        }

        if (a > b || a < d) {
            System.out.println("true || false = true");
        }
        System.out.println("*============================Logical Operator End===============================*");
    }

    /*5. Bitwise Operator*/
    public void bitwiseOperator() {
        System.out.println("*============================Bitwise Operator Started===============================*");
        if (a > b & a > d) {
            System.out.println("Value of A is greater than b and d");
        } else {
            System.out.println("Value of A is smaller than b and d");
        }

        if (a > b | a < d) {
            System.out.println("true || false = true");
        }
        System.out.println("*============================Bitwise Operator End===============================*");
    }
    /*6. Relational Operator*/
    public void relationalOperator() {
        System.out.println("*============================Relational Operator Started===============================*");
        System.out.println(c>b);
        System.out.println(c<b);
        System.out.println(c>=b);
        System.out.println(c<=b);
        System.out.println(a==d);
        System.out.println(a!=b);
        System.out.println("*============================Relational Operator End===============================*");
    }
    /*7. Ternary Operator*/
    public void ternaryOperator() {
        System.out.println("*============================Ternary Operator Started===============================*");
        int min=(a<b)?a:b;
        System.out.println(min);
        System.out.println("*============================Ternary Operator End===============================*");
    }
    /*8. Assignment Operator*/
    public void assignmentOperator() {
        System.out.println("*============================Assignment Operator Started===============================*");
        a+=3;
        System.out.println(a);
        a-=4;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        System.out.println("*============================Assignment Operator End===============================*");
    }
}



