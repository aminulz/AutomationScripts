

import org.json.simple.parser.JSONParser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FirstTest {
    WebDriver driver = null;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js;

    public FirstTest() {
    }

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver\\chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.managed_default_content_settings.images", 2);
        //adding capabilities to browser
        ChromeOptions op = new ChromeOptions();
        op.setPageLoadStrategy(PageLoadStrategy.EAGER);
        op.setExperimentalOption("prefs", prefs);
        op.addArguments("--remote-allow-origins=*");
        this.driver = new ChromeDriver(op);
//        this.driver.page_load_strategy = "none";
        this.baseUrl = "https://www.google.com/";
        this.driver.manage().timeouts().implicitlyWait(1L, TimeUnit.SECONDS);
        this.js = (JavascriptExecutor) this.driver;
    }

    @Test
    public void testSmtestUsers() throws Exception {

        for (int i = 1700011620; i < 1800000000; ) {
            try {
                this.driver.get("https://friendship.ruchiexplorelimitless.com/quiz/64c77910dd4f6");
//        this.driver.maximize_window();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/div/div/button")).click();
//        this.driver.findElement(By.id("hint-toggle")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/form/div/div[1]/div[1]/label/input")).clear();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/form/div/div[1]/div[2]/label/input")).clear();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/form/div/div[1]/div[1]/label/input")).sendKeys("Faruk");
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/form/div/div[1]/div[2]/label/input")).sendKeys("0" + i);
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[2]/form/div/div[1]/button")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[3]/div[2]/div/div[3]/div/div[3]/div/button")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[3]/div[3]/div/div[3]/div/div[2]/div/button")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div[3]/div/div[2]/div/button")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[3]/div[5]/div/div[3]/div/div[3]/div/button")).click();
                this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[2]/div[3]/div[6]/div/div[3]/div/div[2]/div/button")).click();
//            this.driver.quit();


                if (this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/div/div/button")).isDisplayed()) {
                    try {
                        this.driver.manage().deleteAllCookies();
                    } catch (Exception e) {
                        i++;
                    } finally {
                        i++;
                    }
                } else if ((this.driver.findElement(By.cssSelector("body > div > div.flex.flex-col.min-h-screen.py-6 > div > div > div > div.pt-14.font-semibold > div:nth-child(3) > a")).isDisplayed())) {
                    try {
                        this.driver.manage().deleteAllCookies();
                    } catch (Exception e) {
                        i++;
                    } finally {
                        i++;
                    }
                } else {
                    try {
                        this.driver.manage().deleteAllCookies();
                    } catch (Exception e) {
                        i++;
                    } finally {
                        i++;
                    }
                }
            } catch (Exception e) {
                this.driver.quit();
                break;
            }
        }
    }

    @After
    public void tearDown() throws Exception {
        String verificationErrorString = this.verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            Assert.fail(verificationErrorString);
        }

    }


}
