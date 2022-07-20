package OOPSConcepts.Array;

public class Array {

    public static void main(String[] args) {
        int age[] = new int[5];
        age[0] = 10;
        age[1] = 20;
        age[2] = 30;
        age[3] = 70;
        age[4] = 90;

        for(int i = 0; i<age.length;i++){
            System.out.println(age[i]);
        }

        String userName[] = {"Pradip","Vishakha","Ashok"};
        System.out.print("[");
        for(String name : userName){
            System.out.print(name+" ");
        }
        System.out.print("]");
    }

}
