package com.qacart.todo.objects;

public class Tasks {
    private String item ;
    private boolean isCompleted;

    public Tasks(String item , boolean isCompleted) {
        this.item = item;
        this.isCompleted = isCompleted;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setIsCompleted(boolean completed) {
        isCompleted = completed;
    }
    public String getItem() {
        return this.item;
    }
    public boolean getIsCompleted() {
        return this.isCompleted;
    }


}
