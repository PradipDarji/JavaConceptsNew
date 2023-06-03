package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L11_Button {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Button")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        highLighterMethod(driver, driver.findElement(By.xpath("(//button[contains(text(),'A button element')])[1]")));
        driver.findElement(By.xpath("(//button[contains(text(),'A button element')])[1]")).click();
        highLighterMethod(driver, driver.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']")));
        driver.findElement(By.xpath("//input[@class='ui-button ui-corner-all ui-widget']")).click();
        highLighterMethod(driver, driver.findElement(By.linkText("An anchor")));
        driver.findElement(By.linkText("An anchor")).click();
        Thread.sleep(5000);
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
