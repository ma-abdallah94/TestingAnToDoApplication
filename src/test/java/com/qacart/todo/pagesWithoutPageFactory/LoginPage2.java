package com.qacart.todo.pagesWithoutPageFactory;


import com.qacart.todo.utils.ConfigUtils;
import com.qacart.todo.utils.PropUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginPage2 {

    private WebDriver driver ;
    private By emailInput2 = By.cssSelector("#login");
    private By PasswordIn2 = By.cssSelector("[data-testid=\"password\"]");
    private By submit2 = By.cssSelector("[data-testid=\"submit\"]");


    public LoginPage2(WebDriver driver) {
        this.driver=driver ;
    }

    public ToDoPage2 login (String email , String password ) {
        driver.findElement(emailInput2).sendKeys(email);
        driver.findElement(PasswordIn2).sendKeys(password);
        driver.findElement(submit2).click();
        return new ToDoPage2(driver);
    }

    public LoginPage2 load() {
        driver.get(ConfigUtils.getInstance().baseUrl());;
        return this;
    }

}
