package com.qacart.todo.testcases;


import com.qacart.todo.api.RegisterAPI;
import com.qacart.todo.factory.BaseFactoryTest;
import com.qacart.todo.pagesWithoutPageFactory.LoginPage2;
import com.qacart.todo.pagesWithoutPageFactory.ToDoPage2;
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

        RegisterAPI registerAPI = new RegisterAPI();
        registerAPI.register();
        ToDoPage2 toDoPage2 = new ToDoPage2(driver) ;
        toDoPage2.load();
        InjectCookiesIntoBrowser(registerAPI.getCookies());


        boolean isWelcomeDisplayed = toDoPage2.load()
                .isItLogged();
        Assert.assertTrue(isWelcomeDisplayed);
           }
}
