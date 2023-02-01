import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) {

        String baseURL = "http://smtest.suffixit.com:8576/";
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ZERO);

        driver.get(baseURL);
        driver.findElement(By.name("username")).sendKeys("TER1005");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
//        driver.quit();
    }
}