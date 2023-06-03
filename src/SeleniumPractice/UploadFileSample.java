package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSample {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/seeker/registration");
        WebElement uploadElement = driver.findElement(By.xpath("//input[@id='file-upload']"));
        uploadElement.sendKeys("E:\\Resume\\Pradip Darji Quality Analyst_7.8YOE.pdf");
        driver.close();
    }
}
