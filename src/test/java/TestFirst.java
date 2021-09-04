import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFirst {

    @Test
    public void navigateToFreeConsultationForm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        By buttonFreeConsultationPath = By.id("btn-consultation-hero");
        WebElement buttonFreeConsultation = driver.findElement(buttonFreeConsultationPath);
        buttonFreeConsultation.click();

        By fieldNamePath = By.id("input-name-consultation");
        WebElement fieldName = driver.findElement(fieldNamePath);
        fieldName.click();
        fieldName.sendKeys("Тест");

        Assert.assertTrue(driver.getCurrentUrl().equals("https://ithillel.ua/"));

        driver.quit();




    }
}

