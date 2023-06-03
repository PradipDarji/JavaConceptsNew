package TestNG;

import org.testng.annotations.*;

public class HierarchyInTestNGAnnotations {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite method calling.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class method calling.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before test method calling.");
    }

    @BeforeMethod
    public void beforeTMethod() {
        System.out.println("Before method  method calling.");
    }

    @Test
    public void test() {
        System.out.println("Test method calling.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method method calling.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite method calling.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class method calling.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After test method calling.");
    }
}
