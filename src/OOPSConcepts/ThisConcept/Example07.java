package OOPSConcepts.ThisConcept;

public class Example07 {
    int i = 80;
    Example07() {
        Example06 ex006 = new Example06(this);
    }

    void  test(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Example07 ex07 = new Example07();
        ex07.test();
    }
}
