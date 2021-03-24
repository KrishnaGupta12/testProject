import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Test_RestAssured_Get2 {

    @Test
    public void testGet()
    {
        System.out.println("One More Example Here we will see test output on console");

        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("data.id[1]",equalTo(8))
                .log().all();
    }


}
