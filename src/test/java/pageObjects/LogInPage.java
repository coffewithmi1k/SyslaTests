package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends PageNavigator {



    public LogInPage (WebDriver driver) {
        super(driver);
    }

    public void logUserWithValidCreds(){
        driver.findElement(By.xpath("//*[@id=\"CredIdentifier\"]")).sendKeys("coffeacc10@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"CredPassword\"]")).sendKeys("Qwe1156q@@");
        driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/button")).click();
    }
}
