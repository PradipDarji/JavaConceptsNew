package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class L12_Checkboxradio {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/demos/");
        driver.findElement(By.linkText("Checkboxradio")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        highLighterMethod(driver, driver.findElement(By.xpath("//label[@for='radio-3']")));
        WebElement radioButton = driver.findElement(By.xpath("//label[@for='radio-3']"));
        String color01  = radioButton.getCssValue("background-color");
        String beforeClickRadio = Color.fromString(color01).asHex();
        System.out.println(beforeClickRadio);
        radioButton.click();
        String color02 = radioButton.getCssValue("background-color");
        String afterClickRadio = Color.fromString(color02).asHex();
        System.out.println(afterClickRadio);
        if (!beforeClickRadio.equals(afterClickRadio)) {
            System.out.println(radioButton.getText() + " is selected!");
        } else {
            System.out.println(radioButton.getText() + " is not selected!");
        }
        WebElement checkboxButton = driver.findElement(By.xpath("//label[@for='checkbox-4']"));
        String color03  = checkboxButton.getCssValue("background-color");
        String beforeClickCheck = Color.fromString(color03).asHex();
        System.out.println(beforeClickCheck);
        checkboxButton.click();
        String color04 = checkboxButton.getCssValue("background-color");
        String afterClickCheckBox = Color.fromString(color04).asHex();
        System.out.println(afterClickCheckBox);
        if (!beforeClickCheck.equals(afterClickCheckBox)) {
            System.out.println(checkboxButton.getText() + " is selected!");
        } else {
            System.out.println(checkboxButton.getText() + " is not selected!");
        }
        WebElement checkboxButton02 = driver.findElement(By.xpath("//label[@for='checkbox-nested-2']"));
        String color05  = checkboxButton02.getCssValue("background-color");
        String beforeClickCheckBox02 = Color.fromString(color05).asHex();
        System.out.println(beforeClickCheckBox02);
        checkboxButton02.click();
        String color06 = checkboxButton02.getCssValue("background-color");
        String afterClickCheckBox02 = Color.fromString(color06).asHex();
        System.out.println(afterClickCheckBox02);
        if (!beforeClickCheckBox02.equals(afterClickCheckBox02)) {
            System.out.println(checkboxButton02.getText() + " is selected!");
        } else {
            System.out.println(checkboxButton02.getText() + " is not selected!");
        }
        driver.close();
    }

    public static void highLighterMethod(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
    }
}
