package com.qacart.todo.pagesWithoutPageFactory;

import com.qacart.todo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewToDoPage2 {

    private WebDriver driver ;
    private By addingToDoName = By.cssSelector("[data-testid=\"new-todo\"]");
    private By submittingToDo = By.cssSelector("[data-testid=\"submit-newTask\"]");

    public NewToDoPage2(WebDriver driver) {
        this.driver= driver;
    }

    public NewToDoPage2 load(){
        driver.get(ConfigUtils.getInstance().baseUrl() + "/todo/new");
        return this ;
    }

    public ToDoPage2 addingToDo (String toDoName) {
        driver.findElement(addingToDoName).sendKeys(toDoName);
        driver.findElement(submittingToDo).click();
        return new ToDoPage2(driver);
    }
}
