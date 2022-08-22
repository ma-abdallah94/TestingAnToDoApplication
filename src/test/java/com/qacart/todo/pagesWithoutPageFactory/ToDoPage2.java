package com.qacart.todo.pagesWithoutPageFactory;

import com.qacart.todo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToDoPage2 {
        private WebDriver driver ;
        private By welcomeMessage = By.cssSelector("[data-testid=\"welcome\"]");
        private By addingNewToDo = By.cssSelector("[data-testid=\"add\"]");
        private By deletingToDo = By.cssSelector("[data-testid=\"delete\"]");
        private By toDoItem = By.cssSelector("[data-testid=\"todo-text\"]");
        private By noToDo = By.cssSelector("[data-testid=\"no-todos\"]");


        public ToDoPage2(WebDriver driver) {
            this.driver = driver ;
        }

        public ToDoPage2 load(){
            driver.get(ConfigUtils.getInstance().baseUrl() + "/todo");
            return this ;
        }


        public boolean isItLogged() {

            return this.driver.findElement(welcomeMessage).isDisplayed();
        }

        public NewToDoPage2 clickingOnAddToDo () {
            driver.findElement(addingNewToDo).click();
            return new NewToDoPage2(driver);
        }

        public ToDoPage2 deleteToDo () {
            driver.findElement(deletingToDo).click();
            return this;
        }

        public String getToDoText() {
            return driver.findElement(toDoItem).getText();
        }

        public boolean isItDeleted() {
            return driver.findElement(noToDo).isDisplayed();
        }
    }



