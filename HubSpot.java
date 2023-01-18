package hubspot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpot {

    private WebDriver driver;

    @Test
    void HubSpotSearchTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://www.hubspot.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("hs-eu-confirmation-button")).click();
        driver.manage().
        Thread.sleep(5000);
       // webDriver.findElement(By.xpath("//span[text()='hsg-nav__link-label']")).click();
        driver.findElement(By.xpath("//*[@id=\"burger-submenu\"]/ul[1]/li[1]/div/button/span")).click();
        //Thread.sleep(1000);


        //https://www.youtube.com/watch?v=5sHS-j6cYMk

    }

}


