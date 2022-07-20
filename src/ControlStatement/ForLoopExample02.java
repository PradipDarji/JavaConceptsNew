package ControlStatement;

public class ForLoopExample02 {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        int age [] = {10,20,30,40,50,60};
        for(int m =0;m<age.length;m++){
            System.out.println(age[m]);
        }
        System.out.println("************************************************************");
        int k[] = new int[4];
        k[0] = 10;
        k[1] = 20;
        k[2] = 30;
        k[3] = 50;

        for (int m = 0; m < k.length; m++) {
            System.out.println(k[m]);
        }
        System.out.println("************************************************************");
        int weight[] = {10,20,30,40,50,60};
        for(int f:weight){
            System.out.println(f);
        }
        System.out.println("************************************************************");
    }

}
