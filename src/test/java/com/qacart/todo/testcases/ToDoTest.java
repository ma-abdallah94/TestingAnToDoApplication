package com.qacart.todo.testcases;


import com.qacart.todo.factory.BaseFactoryTest;
import com.qacart.todo.pagesWithoutPageFactory.LoginPage2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoTest extends BaseFactoryTest {

    //Checking Todo Functionality ( add and delete )

    @Test
    public void ShouldBeAbleToAddNewToDo()  {
        LoginPage2 loginPage = new LoginPage2(driver) ;
        String actualResult = loginPage.load()
                .login("ma.abdallah94@gmail.com" , "122333")
                .clickingOnAddToDo()
                .addingToDo("New Task 1")
                .getToDoText();
        Assert.assertEquals(actualResult , "New Task 1");
            }
    @Test (enabled = false )
    public void ShouldBeAbleToDeleteToDo() {
        LoginPage2 loginPage = new LoginPage2(driver) ;
        boolean isTaskDeleted = loginPage.load()
                                .login("ma.abdallah94@gmail.com" , "122333")
                                .clickingOnAddToDo()
                                .addingToDo("Task To Get Deleted")
                                .deleteToDo().isItDeleted();
        Assert.assertTrue(isTaskDeleted);
    }



}
