package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L16_Menu {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Menu")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement music = driver.findElement(By.xpath("//div[@id='ui-id-9']"));
        WebElement jazz = driver.findElement(By.xpath("//div[@id='ui-id-13']"));
        WebElement modern = driver.findElement(By.xpath("//div[@id='ui-id-16']"));
        Actions action = new Actions(driver);
        action.moveToElement(music).perform();
        Thread.sleep(2000);
        action.moveToElement(jazz).perform();
        Thread.sleep(2000);
        action.moveToElement(modern).click().perform();
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
