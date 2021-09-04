import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework23 {

        @BeforeTest
        public void navigateToFreeConsultationForm() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.yellowtailwine.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            @Test(description = "Case 1: Welcome page: all required elements are displayed")
                    public void verifyDisplayedItemsWelcomePage() throws InterruptedException {
                Thread.sleep(2000);
                Assert.assertTrue(driver.findElement(By.xpath("//*[@class='fa fa-bars']")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//*[@class='fa fa-bars']")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.className("agegate-selector-options")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//*input[@type='submit']")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//*input[@type='submit']")).isEnabled());
            }

                @Test(description = "Case 2: Welcome page: navigate to main page as European customer")
                public void navigateToPage() throws InterruptedException {
                    Thread.sleep(2000);
                    driver.findElement(By.xpath("//*[@class='confirmation-checkbox']/child;;label")).click();
                    Select dropDown = new Select(driver.findElement(By.id("agegate-selector-options")));
                    dropDown.selectByVisibleText("Europe");
                    driver.findElement(By.xpath("//*input[@type='submit']")).click();
                    Assert.assertTrue(driver.findElement(By.xpath("//p[@class='header-sub-copy'][contains(text(), 'We are')]")).isDisplayed());
                }

            @Test(description = "Case 3: Main page: all required elements are displayed")
            public void verifyDisplayedItemsMainPage() throws InterruptedException {
                Thread.sleep(2000);
                Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Menu')]")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'Welcome')]")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'to the world of')]")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//*[@class = 'header-sub-copy'][contains(text(), 'We are')]")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.xpath("//*[@class ='button home-button']")).isDisplayed());
                Assert.assertTrue(driver.findElement(By.id("primary-footer")).isDisplayed());
            }
            @Test(description = "Case 4: Main page: Menu button logic (open header)")
            public void menuButtonLogic() {
                driver.findElement(By.xpath("//*[@class='confirmation-checkbox']/child::label")).click();
                Select dropDown = new Select(driver.findElement(By.id("agegate-selector-options")));
                dropDown.selectByVisibleText("Europe");
                driver.findElement(By.xpath("//input[@type='submit']")).click();

                WebElement element = driver.findElement(By.xpath("//*[@class='fa fa-bars']"));
                element.click();

                driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::img[@alt='Yellow tail logo']")).click();
                Assert.assertTrue(driver.findElement(By.xpath("//*[@class='fa fa-bars']")).isDisplayed());
            }

            @Test(description = "Case 8: Where to buy: enter valid postal code")
                    public void whereToBuyPage() {
                driver.findElement(By.xpath("//a[text()='Where to Buy']")).click();
                driver.findElement(By.id("locationName")).sendKeys("Sydney");
                driver.findElement(By.xpath("//button[@class='search-submit']")).click();
                Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'Stockists in your area')]")).isDisplayed());
            }

            @AfterTest
                    public void closeDriver(){
                driver.quit();


            }

            }


        }


