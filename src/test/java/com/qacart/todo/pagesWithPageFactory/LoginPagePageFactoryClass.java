/*
package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#login")
    private WebElement emailInput ;

    @FindBy(css = "[data-testid=\"password\"]")
    private WebElement passwordIn ;

    @FindBy(css = "[data-testid=\"submit\"]")
    private WebElement submit ;





    public ToDoPage Login(String email , String password) {
        emailInput.sendKeys(email);
        passwordIn.sendKeys(password);
        submit.click();
        return new ToDoPage(driver);
    }
    public LoginPage load() {
        driver.get("https://qacart-todo.herokuapp.com");
        return this;
    }



}
*/
