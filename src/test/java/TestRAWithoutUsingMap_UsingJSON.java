import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestRAWithoutUsingMap_UsingJSON {

    @Test
    public void test_Post() {
        JSONObject requuest = new JSONObject();
        requuest.put("name", "Dhoni");
        requuest.put("job", "Criketor");
        System.out.println(requuest);
        System.out.println(requuest.toJSONString());

        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .body(requuest.toJSONString())
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .statusCode(201);


    }
}
