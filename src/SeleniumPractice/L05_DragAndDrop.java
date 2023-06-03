package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L05_DragAndDrop {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Droppable")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement dragArea = driver.findElement(By.id("draggable"));
        WebElement dropArea = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragArea,dropArea).build().perform();
        String s1 = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
        if(s1.equalsIgnoreCase("Dropped!")){
            System.out.println(s1+" is displayed.");
        }else{
            System.out.println(s1+" is not displayed.");
        }
        driver.close();
    }
}
