package TestNG;

import org.testng.annotations.Test;

public class GroupingConcept04 {

    @Test  (groups = "Linux.smoke" )
    public void test01(){
        System.out.println(" Inside the test 1 method");
    }

    @Test (groups = "Window.Regression")
    public void test02(){
        System.out.println(" Inside the test 2 method");
    }

    @Test (groups = "Linux.Regression" )
    public void test03(){
        System.out.println(" Inside the test 3 method");
    }

    @Test (groups = "Linux.smoke" )
    public void test04(){
        System.out.println(" Inside the test 4 method");
    }

    @Test (groups = "Mac.smoke" )
    public void test05(){
        System.out.println(" Inside the test 5 method");
    }

    @Test (groups = "Window.Regression")
    public void test06(){
        System.out.println(" Inside the test 6 method");
    }
}
