package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class L01_OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium SetUp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        System.out.println("********************Radio Button Selection*********************");
        WebElement radioButton = driver.findElement(By.xpath("(//input[@class='radioButton'])[2]"));
        radioButton.click();
        if(radioButton.isSelected()){
            System.out.println("Radio Button Example:"+driver.findElement(By.cssSelector("#radio-btn-example label:nth-child(3)")).getText());
        }
        System.out.println("********************Auto Complete DropDown*********************");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(5000);
        List<WebElement> CountryList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
        int contryListSize = CountryList.size();
        System.out.println(contryListSize);
        for(int i = 0;i<CountryList.size();i++){
            String countryName = CountryList.get(i).getText();
            if(countryName.equalsIgnoreCase("India")){
                CountryList.get(i).click();
                Thread.sleep(5000);
            }
        }
        System.out.println("********************Static DropDown*********************");
        WebElement selectValue = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectValue);
        select.selectByValue("option1");
        Thread.sleep(5000);
        System.out.println("********************Checkbox Example*********************");
        WebElement checkButton = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
        checkButton.click();
        if(checkButton.isSelected()){
            System.out.println("Checkbox Example:"+driver.findElement(By.cssSelector("#checkbox-example fieldset label:nth-child(4)")).getText());
        }
        System.out.println("********************Switch Window Example*********************");
        String parentWinHandle = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        Set<String> handels = driver.getWindowHandles();
        Iterator<String> itr = handels.iterator();
        while(itr.hasNext()){
          String childWindows   = itr.next();
          if(!parentWinHandle.equals(childWindows)){
              driver.switchTo().window(childWindows);
              System.out.println("Title of the new window: " + driver.getTitle());
              System.out.println("Closing the new window...");
              driver.close();
          }
            driver.switchTo().window(parentWinHandle);
            // Print the URL to the console
            System.out.println("Parent window URL: " + driver.getCurrentUrl());

        }
        System.out.println("********************Switch Tab Example*********************");
        String firstWindow = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWinHandle);
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        Set<String> windowLists = driver.getWindowHandles();
        for(String windows : windowLists){
            if(!windows.equals(firstWindow)){
                driver.switchTo().window(windows);
                Thread.sleep(1000);
                System.out.println("Title of the new window: " + driver.getTitle());
                System.out.println("Closing the new window...");
                driver.close();
            }
            driver.switchTo().window(firstWindow);
            // Print the URL to the console
            System.out.println("Parent window URL: " + driver.getTitle());
        }
        System.out.println("********************Switch To Alert Example*********************");
        driver.findElement(By.id("alertbtn")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        System.out.println("********************Mouse Hover Example*********************");
        System.out.println("********************iFrame Example*********************");

        driver.quit();

    }
}
