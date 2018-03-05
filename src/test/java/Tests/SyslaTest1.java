package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.PageNavigator;

import static org.junit.Assert.assertEquals;

public class SyslaTest1 {


    private WebDriver driver;

    @Before
    public void seUp(){
driver = new ChromeDriver();
driver.manage().window().maximize();
    }



    @After
    public void tearDown(){
        driver.close();
    }

    

    @Test
    public void checkLoginWithValidUser()  {
        PageNavigator nav = new PageNavigator(driver);
        HomePage onHomePage = nav.getHomePage();
        LogInPage onLogInPage =onHomePage.clickLogInbutton();
        onLogInPage.logUserWithValidCreds();




    }
}
