package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class L14_DatePicker {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Datepicker")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement dateBox = driver.findElement(By.id("datepicker"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        dateBox.sendKeys(dtf.format(now));
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
