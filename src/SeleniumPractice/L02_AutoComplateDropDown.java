package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L02_AutoComplateDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("in");
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        int size = list.size();
        System.out.println("Size of List is:: " + size);
        for (WebElement countryList : list) {
            if (countryList.getText().equalsIgnoreCase("India")) {
                countryList.click();
            }
        }
        driver.close();
    }
}
