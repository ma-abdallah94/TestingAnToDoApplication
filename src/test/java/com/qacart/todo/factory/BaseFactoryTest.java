package com.qacart.todo.factory;

import com.qacart.todo.utils.CookieUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.Cookie;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class BaseFactoryTest {


    protected WebDriver driver ;

    public WebDriver driverInitializer() {
        String browser = System.getProperty("browser" , "Chrome");
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver() ;
                break;
            case "FireFox" :
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver() ;
                break;
            case "Edge" :
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Not Supported Browser " ) ;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver ;
    }

    @BeforeMethod
    public void setup(){
        driver = new BaseFactoryTest().driverInitializer();
    }

    @AfterMethod
    public void teardown(ITestResult result){
        String testCaseName = result.getMethod().getMethodName();
        File screenshotDest = new File("Screenshots"+ File.separator + testCaseName+".png");
        takeScreenshot(screenshotDest);
        driver.quit();
    }

    public void InjectCookiesIntoBrowser(List<Cookie> restAssuredCookies) {
        List<org.openqa.selenium.Cookie> seleniumCookies =CookieUtils.convertRestAssruedCookiesToSeleniumCookies(restAssuredCookies);
        for (org.openqa.selenium.Cookie cookie : seleniumCookies) {
            driver.manage().addCookie(cookie);
            }
    }

    public void takeScreenshot(File screenshotDest){
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file , screenshotDest);
        } catch (IOException e) {
            throw new RuntimeException("Something Went Wrong");
        }
    }
}
