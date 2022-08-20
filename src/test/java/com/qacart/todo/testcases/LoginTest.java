package com.qacart.todo.testcases;


import com.qacart.todo.factory.BaseFactoryTest;
import com.qacart.todo.pagesWithoutPageFactory.LoginPage2;
import com.qacart.todo.utils.ConfigUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseFactoryTest {

    //Checking Login Functionality
    @Test
    public void ShouldBeAbleToLoginWithEmailAndPassword() {
        LoginPage2 loginPage = new LoginPage2(driver) ;
        boolean isWelcomeDisplayed = loginPage.load()
                .login(ConfigUtils.getInstance().email(), ConfigUtils.getInstance().password())
                .isItLogged();
        Assert.assertTrue(isWelcomeDisplayed);
           }
}
