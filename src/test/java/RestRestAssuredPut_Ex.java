import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RestRestAssuredPut_Ex {
    @Test
    public void test_Put() {
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
                .put("https://reqres.in/api/users/2")
                .then()
                .statusCode(200)
                .log().all();



    }
}
