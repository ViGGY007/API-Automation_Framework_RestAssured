package org.viggy.api.client;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class UserClient {
    public static Response getUsers(){
        return given()
                .when()
                .get("/users");
    }
}
