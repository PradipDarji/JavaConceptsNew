package JavaInterviewPrograms;

public class DuplicateElementFromArrayList {
    public static void main(String[] args) {
        int age[] = {10,15,25,35,15,36,45,15};
        for(int i = 0; i<age.length;i++){
            for(int j = i+1; j<age.length;j++){
                if(age[i]==age[j]){
                    System.out.println(age[j]);
                }
            }
        }
    }
}
