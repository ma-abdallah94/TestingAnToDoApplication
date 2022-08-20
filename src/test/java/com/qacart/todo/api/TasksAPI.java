package com.qacart.todo.api;

import com.qacart.todo.objects.Tasks;
import com.qacart.todo.utils.ConfigUtils;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TasksAPI {
    public void addTask(String token ){
        Tasks task = new Tasks("Learning", false) ;

        Response response =
        given().baseUri(ConfigUtils.getInstance().baseUrl())
                .header("Content-Type" ,"application/json")
                .body(task)
                .auth().oauth2(token)
        .when()
                .post("/api/v1/tasks")
        .then()
                .log().all().extract().response();

        if(response.statusCode()!=201) {
            throw new RuntimeException("There is an error in adding a ToDo ") ;
        }
    }

}
