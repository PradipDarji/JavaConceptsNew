package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class L09_Accordion {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Accordion")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement section4 = driver.findElement(By.xpath("//div[@id='accordion']/h3[4]"));
        String color01  = section4.getCssValue("background-color");
        String beforeSelect = Color.fromString(color01).asHex();
        System.out.println(beforeSelect);
        section4.click();
        String color02 = section4.getCssValue("background-color");
        String afterSelect = Color.fromString(color02).asHex();
        System.out.println(afterSelect);
        if (!beforeSelect.equals(afterSelect)) {
            System.out.println(section4.getText() + " is selected!");
        } else {
            System.out.println(section4.getText() + " is not selected!");
        }
        driver.close();
    }
}
