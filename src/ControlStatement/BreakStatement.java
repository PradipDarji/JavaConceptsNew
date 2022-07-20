package ControlStatement;

public class BreakStatement {
    public static void main(String[] args) {
        int i = 1;
        for(i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){
                break;
            }
        }
    }
}
