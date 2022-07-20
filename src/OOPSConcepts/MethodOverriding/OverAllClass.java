package OOPSConcepts.MethodOverriding;

public class OverAllClass{
    public static void main(String[] args) {
        SBI s=new SBI();
        Kotak i=new Kotak();
        Axis a=new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("Kotak Rate of Interest: "+i.getRateOfInterest());
        System.out.println("Axis Rate of Interest: "+a.getRateOfInterest());
    }
}
