import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Final_Project
{

    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","/home/rafal/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement Cookies = driver.findElement(By.xpath("//button[normalize-space()='Got it!']"));
//        Cookies.click();
          WebElement Flights = driver.findElement(By.xpath("//a[normalize-space()='Flights']"));
          Flights.click();
//        Destination.sendKeys("Bali, Papua New Guinea");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement CheckIn = driver.findElement(By.cssSelector("#checkin"));
//        CheckIn.sendKeys("08/05/2021");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement CheckOut = driver.findElement(By.cssSelector("#checkout"));
//        CheckOut.sendKeys("15/05/2021");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement Adults = driver.findElement(By.xpath("//input[@value='2']"));
//        Adults.click();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement Search = driver.findElement(By.xpath("form[name='HOTELS'] button[type='submit']"));
//        Search.click();
    }
}

