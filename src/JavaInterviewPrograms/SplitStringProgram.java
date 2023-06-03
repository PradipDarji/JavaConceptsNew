package JavaInterviewPrograms;

public class SplitStringProgram {
    public static void main(String[] args) {
        String s1 = "Pradip Darji Ashokbhai";
        String[] words = s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
