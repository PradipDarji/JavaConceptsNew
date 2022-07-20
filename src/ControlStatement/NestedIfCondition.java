package ControlStatement;

public class NestedIfCondition {
    public static void main(String[] args) {
        int weight = 40;
        int age = 15;

        if (age > 20) {
            if (weight > 50) {
                System.out.println("You can join the indian army");
            } else {
                System.out.println("You are rejected due to the less weight!!!");
            }
        } else {
            System.out.println("You are rejected due to the small age!!!");
        }
    }
}
