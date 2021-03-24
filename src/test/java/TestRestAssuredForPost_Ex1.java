import org.json.simple.JSONObject;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestRestAssuredForPost_Ex1 {

    @Test
    public void test_Post()
    {
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("name","Krishna");
        map.put("job","Software Engineer");

        /*  convert map data in to JSON Object*/
        /* add first of all dependency JSON.simple/Gson/Jackson/JSON   */
        JSONObject request= new JSONObject(map);
        System.out.println(request);
        System.out.println(request.toJSONString());

    }
}
