package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends  PageNavigator {

    public HomePage (WebDriver driver) {
        super(driver);
    }

    public LogInPage clickLogInbutton(){
        driver.findElement(By.xpath("/html/body/nav/div[4]/div/div[3]/div[2]/div[1]/a")).click();
        return new LogInPage(driver);
    }
}
