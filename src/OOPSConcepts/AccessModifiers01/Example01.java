package OOPSConcepts.AccessModifiers01;

public class Example01 {
    public int i =50;
    private int j =50;
    protected  int k =50;
    int l =50;

    public void test1(){
        System.out.println("Test1 public method calling from Example01.......... ");
    }

    private void test2(){
        System.out.println("Test2 private method calling from Example01.......... ");
    }

    protected void test3(){
        System.out.println("Test3 protected method calling from Example01.......... ");
    }

    void test4(){
        System.out.println("Test4 default method calling from Example01.......... ");
    }

}
