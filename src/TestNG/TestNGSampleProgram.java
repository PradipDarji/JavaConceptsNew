package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSampleProgram {

    public WebDriver driver;

    @BeforeTest
    public void initiateWebDriverBrowser(){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openWebApplication(){
        driver.get("https://naveenautomationlabs.com/opencart/");
    }

    @AfterTest
    public void terminateWebDriverBrowser(){
        driver.close();
    }
}
