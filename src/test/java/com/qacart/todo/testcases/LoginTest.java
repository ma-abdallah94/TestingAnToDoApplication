package com.qacart.todo.testcases;


import com.qacart.todo.factory.BaseFactoryTest;
import com.qacart.todo.pagesWithoutPageFactory.LoginPage2;
import com.qacart.todo.utils.ConfigUtils;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Authentications ")
public class LoginTest extends BaseFactoryTest {
    //Checking Login Functionality

    @Story("Login By Valid Email&Password")
    @Test (description = "Testing the login functionality by using email and password ")
    public void ShouldBeAbleToLoginWithEmailAndPassword() {
        LoginPage2 loginPage = new LoginPage2(driver) ;
        boolean isWelcomeDisplayed = loginPage.load()
                .login(ConfigUtils.getInstance().email(), ConfigUtils.getInstance().password())
                .isItLogged();
        Assert.assertTrue(isWelcomeDisplayed);
           }
}
