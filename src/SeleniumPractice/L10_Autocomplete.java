package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import java.util.List;

public class L10_Autocomplete {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.id("tags")).sendKeys("ja");
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        int listItem = list.size();
        System.out.println("*****************************Option 01*****************************");
        for(WebElement itemData : list){
            if(itemData.getText().equalsIgnoreCase("Java")){
                itemData.click();
            }
        }
        Thread.sleep(5000);
        driver.findElement(By.id("tags")).clear();
        driver.findElement(By.id("tags")).sendKeys("ja");
        Thread.sleep(5000);
        List<WebElement> list02 = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
        System.out.println("*****************************Option 02*****************************");
        for(int i = 0; i<list02.size();i++){
            String itemName = list02.get(i).getText();
            if(itemName.equalsIgnoreCase("JavaScript")){
                 list02.get(i).click();
            }
        }
        Thread.sleep(5000);
        driver.close();
    }
}
