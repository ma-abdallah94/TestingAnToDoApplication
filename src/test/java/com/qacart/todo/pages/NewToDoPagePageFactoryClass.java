/*
package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.testcases.ToDoTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToDoPage extends BasePage {

    public NewToDoPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement addingToDoName ;

    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement submittingToDo ;


    public ToDoPage addingToDo (String toDoName) {
        addingToDoName.sendKeys(toDoName);
        submittingToDo.click();
         return new ToDoPage(driver);
    }
}
*/
