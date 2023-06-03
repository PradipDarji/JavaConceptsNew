package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L20_Tooltip {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Tooltip")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        WebElement toolTipMessage = driver.findElement(By.xpath("//input[@id='age']"));
        //Get title attribute value
        String tooltipText = toolTipMessage.getAttribute("title");

        System.out.println("Retrieved tooltip text as :"+tooltipText);

        //Verification if tooltip text is matching expected value
        if(tooltipText.equalsIgnoreCase("We ask for your age only for statistical purposes.")){
            System.out.println("Pass : Tooltip matching expected value");
        }
        else{
            System.out.println("Fail : Tooltip NOT matching expected value");
        }
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
