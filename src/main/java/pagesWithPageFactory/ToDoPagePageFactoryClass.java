/*
package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDoPage extends BasePage {

    public ToDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[data-testid=\"welcome\"]")
    private WebElement welcomeMessage;

    @FindBy ( css = "[data-testid=\"add\"]" )
    private WebElement addingNewToDo ;

    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement addingToDoName ;

    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement deletingToDo ;

    @FindBy(css = "[data-testid=\"todo-text\"]")
    private WebElement toDoItem ;

    @FindBy(css = "[data-testid=\"no-todos\"]")
    private WebElement noToDo ;


    public boolean isItLogged() {
        return welcomeMessage.isDisplayed();
    }

    public NewToDoPage clickingOnAddToDo () {
        addingNewToDo.click();
        return new NewToDoPage(driver);
    }


    public ToDoPage deleteToDo () {
        deletingToDo.click();
        return this;
    }

    public String getToDoText() {
        return toDoItem.getText();
    }

    public boolean isItDeleted() {
        return noToDo.isDisplayed();
    }


}
*/
