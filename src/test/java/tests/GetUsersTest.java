package tests;

import base.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.viggy.api.client.UserClient;

import static org.testng.AssertJUnit.assertEquals;

public class GetUsersTest extends BaseTest {

    @Test
    public void getUsersList() {

        Response response = UserClient.getUsers();
        response
                .then()
                .log().status()
                .log().body();
        assertEquals(200, response.statusCode());
    }
}
