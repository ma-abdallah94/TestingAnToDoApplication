package com.qacart.todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseFactoryTest {


    protected WebDriver driver ;

    public WebDriver driverInitializer() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver ;
    }

    @BeforeMethod
    public void setup(){
        driver = new BaseFactoryTest().driverInitializer();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }

}
