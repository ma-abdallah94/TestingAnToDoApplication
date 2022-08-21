package com.qacart.todo.testcases;


import com.qacart.todo.api.RegisterAPI;
import com.qacart.todo.api.TasksAPI;
import com.qacart.todo.factory.BaseFactoryTest;
import com.qacart.todo.pagesWithoutPageFactory.LoginPage2;
import com.qacart.todo.pagesWithoutPageFactory.ToDoPage2;
import com.qacart.todo.utils.ConfigUtils;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("ToDo Functionalities ")
public class ToDoTest extends BaseFactoryTest {

    //Checking Todo Functionality ( add and delete )

    @Story("Adding To Do ")
    @Test (description = "Testing adding new todo ")
    public void ShouldBeAbleToAddNewToDo()  {

        LoginPage2 loginPage = new LoginPage2(driver) ;
        String actualResult = loginPage.load()
                .login(ConfigUtils.getInstance().email(), ConfigUtils.getInstance().password())
                .clickingOnAddToDo()
                .addingToDo("New Task 1")
                .getToDoText();
        Assert.assertEquals(actualResult , "New Task 1");
            }


    @Story("Deleting To Do ")
    @Test (description = "Testing the delete button ")
    public void ShouldBeAbleToDeleteToDo() {
        RegisterAPI registerAPI = new RegisterAPI();
        registerAPI.register();

        TasksAPI tasksAPI = new TasksAPI();
        tasksAPI.addTask(registerAPI.getAccessToken());

        ToDoPage2 toDoPage2 = new ToDoPage2(driver) ;
        toDoPage2.load();
        InjectCookiesIntoBrowser(registerAPI.getCookies());

        boolean isTaskDeleted = toDoPage2.load().deleteToDo().isItDeleted();
        Assert.assertTrue(isTaskDeleted);
    }



}
