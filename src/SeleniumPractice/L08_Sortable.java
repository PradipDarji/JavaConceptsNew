package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class L08_Sortable {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Sortable")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement beforeTheSort = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
        String beforeSortItemName = beforeTheSort.getText();
        System.out.println("Before the sort item name is "+beforeSortItemName);
        Actions action = new Actions(driver);
        action.clickAndHold(beforeTheSort).moveByOffset(100,100).release(beforeTheSort).build().perform();
        WebElement afterTheSort = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
        String afterSortItemName = afterTheSort.getText();
        System.out.println("After the sort item name is "+afterSortItemName);
        if(!beforeSortItemName.equals(afterSortItemName)){
            System.out.println("Before the sort item name is "+beforeSortItemName+" && After the sort item name is "+afterSortItemName+".Sort functionality working fine.");
        }else{
            System.out.println("Sort functionality not working fine.");
        }
        driver.close();
    }
}
