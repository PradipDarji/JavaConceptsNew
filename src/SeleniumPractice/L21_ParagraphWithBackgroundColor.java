package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L21_ParagraphWithBackgroundColor {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://patternbasedwriting.com/elementary_writing_success/paragraph-examples/");
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.tagName("p"));
        System.out.println(list);
        driver.close();
    }
}
