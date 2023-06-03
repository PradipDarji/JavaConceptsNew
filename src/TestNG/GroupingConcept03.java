package TestNG;

import org.testng.annotations.Test;

public class GroupingConcept03 {
   @Test(groups = {"Sanity","Regression"})
    public void WebLoginHomeLoan() {
        System.out.println("Web Login Home Loan");
    }

    public void MobileLoginHomeLoan() {
        System.out.println("Mobile Login Home Loan");
    }

    @Test(groups = {"SmokeTest"})
    public void APILoginHomeLoan() {
        System.out.println("API Login Home Loan");
    }
}
