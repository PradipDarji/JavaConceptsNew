package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L19_Tabs {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Tabs")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement aeneanLacinia = driver.findElement(By.xpath("//a[@id='ui-id-3']"));
        aeneanLacinia.click();
        if(aeneanLacinia.getText().equalsIgnoreCase("Aenean lacinia")){
            System.out.println("Selected tab is: "+aeneanLacinia.getText());
        }else{
            System.out.println("Not Corrected Tab Selected!!!");
        }
        Thread.sleep(5000);
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
