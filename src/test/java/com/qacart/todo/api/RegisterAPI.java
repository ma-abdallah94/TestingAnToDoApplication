package com.qacart.todo.api;

import com.qacart.todo.objects.User;
import com.qacart.todo.utils.UserUtils;
import io.restassured.http.Cookie;
import io.restassured.response.Response;
import java.util.List;
import static io.restassured.RestAssured.given;

public class RegisterAPI {

    private List<Cookie> restAssuredCookies;
    private String accessToken;
    private String userID;
    private String firstName;

    public String getUserID() {
        return this.userID;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public List<Cookie> getCookies() {
        return this.restAssuredCookies;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public void register() {
        User user = UserUtils.generateRandomUsers();

        Response response = given().baseUri("https://qacart-todo.herokuapp.com")
                .header("Content-Type" ,"application/json")
                .body(user)
                .log().all()
                .when().post("/api/v1/users/register")
                .then().extract().response();

        if(response.statusCode()!=201) {
            throw new RuntimeException("There is an error while registering ") ;
        }
        restAssuredCookies = response.detailedCookies().asList();
        accessToken = response.path("access_token");
        userID = response.path("userID");
        firstName = response.path("firstName");
    }


}
