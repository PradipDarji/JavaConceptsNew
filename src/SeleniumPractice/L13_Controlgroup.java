package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class L13_Controlgroup {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Controlgroup")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.id("car-type-button")).click();
        List<WebElement> carList = driver.findElements(By.xpath("//ul[@id='car-type-menu']/li"));
        int size = carList.size();
        for(int i = 0; i<size;i++){
            String carName = carList.get(i).getText();
            if(carName.equalsIgnoreCase("Van")){
                carList.get(i).click();
            }
        }
        driver.findElement(By.xpath("(//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[2]")).click();
        driver.findElement(By.xpath("(//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[3]")).click();
        driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
        driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n']")).click();
        driver.findElement(By.xpath("//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")).click();
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
