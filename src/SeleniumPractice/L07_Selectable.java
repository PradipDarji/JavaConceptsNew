package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class L07_Selectable {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Selectable")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement selectable = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
        String color01  = selectable.getCssValue("background-color");
        String beforeSelect = Color.fromString(color01).asHex();
        System.out.println(beforeSelect);
        selectable.click();
        String color02 = selectable.getCssValue("background-color");
        String afterSelect = Color.fromString(color02).asHex();
        System.out.println(afterSelect);
        if (!beforeSelect.equals(afterSelect)) {
            System.out.println(selectable.getText() + " is selected!");
        } else {
            System.out.println(selectable.getText() + " is not selected!");
        }
        driver.close();
    }
}
