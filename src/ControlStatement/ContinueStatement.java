package ControlStatement;

public class ContinueStatement {
    public static void main(String[] args) {
        int i = 1;
        for(i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}
