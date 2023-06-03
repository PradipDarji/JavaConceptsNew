package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class L17_Selectmenu {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Selectmenu")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.xpath("//span[@id='speed-button']")).click();
        List<WebElement> speedMenuItem = driver.findElements(By.xpath("//ul[@id='speed-menu']/li"));
        int size = speedMenuItem.size();
        System.out.println(size);
        for(WebElement item : speedMenuItem ){
            if(item.getText().equalsIgnoreCase("Fast")){
                item.click();
            }
        }
        driver.findElement(By.xpath("//span[@id='files-button']")).click();
        List<WebElement> fileMenuItem = driver.findElements(By.xpath("//ul[@id='files-menu']/li"));
        int size01 = fileMenuItem.size();
        System.out.println(size01);
        for(WebElement item01 : fileMenuItem ){
            if(item01.getText().equalsIgnoreCase("Some unknown file")){
                item01.click();
            }
        }

        driver.findElement(By.xpath("//span[@id='number-button']")).click();
        List<WebElement> numberMenuItem = driver.findElements(By.xpath("//ul[@id='number-menu']/li"));
        int size02 = numberMenuItem.size();
        System.out.println(size02);
        for(WebElement item02 : numberMenuItem ){
            if(item02.getText().equalsIgnoreCase("14")){
                item02.click();
            }
        }
        driver.findElement(By.xpath("//span[@id='salutation-button']")).click();
        List<WebElement> salutationMenuItem = driver.findElements(By.xpath("//ul[@id='salutation-menu']/li"));
        int size03 = numberMenuItem.size();
        System.out.println(size03);
        for(WebElement item03 : salutationMenuItem ){
            if(item03.getText().equalsIgnoreCase("Mrs.")){
                item03.click();
            }
        }
        Thread.sleep(5000);
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
