import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestTestAssuredforGet1 {

    @Test
    public void getRequestTest() {
        System.out.println("Testing Program ");
        given()
                .when()
                .get("http://swapi.dev/api/people/1")
                .then()
                .statusCode(200)
                .and()
                .assertThat()
                .body("name",equalTo("Luke Skywalker"))
                .body("gender",equalTo("male"))
                .body("height",equalTo("172"))
                .body("hair_color",equalTo("blond"))
                .body("homeworld",equalTo("http://swapi.dev/api/planets/1/"))
                .and()
                .header("content-type", "application/json")
                .header("server", "nginx/1.16.1")
                .header("allow","GET, HEAD, OPTIONS");

    }
}
