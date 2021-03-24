import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestRestforGet {

    @Test
    public void getTest() {
        System.out.println("Hello User");
        given()
                .when()
                .get("http://swapi.dev/api/")
                .then()
                .assertThat()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON)
                .and()
                .body("planets",equalTo("http://swapi.dev/api/planets/"))
                .body("people", equalTo("http://swapi.dev/api/people/"))
                .body("films",equalTo("http://swapi.dev/api/films/"))
                .and()
                .header("content-type", "application/json")
                .header("allow", "GET, HEAD, OPTIONS");

    }

}
