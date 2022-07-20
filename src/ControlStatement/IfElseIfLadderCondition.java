package ControlStatement;

public class IfElseIfLadderCondition {
    public static void main(String[] args) {
        int mark = 35;
        if(mark > 40 && mark < 50){
            System.out.println("You earn D grade");
        } else if (mark > 50 && mark < 60) {
            System.out.println("You earn C grade");
        } else if (mark > 60 && mark < 70) {
            System.out.println("You earn D grade");
        } else if (mark > 70 && mark < 80) {
            System.out.println("You earn B grade");
        } else if (mark > 80 && mark < 95) {
            System.out.println("You earn A grade");
        }else {
            System.out.println("You are failed!!!");
        }
    }
}
