import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.util.Map;
import java.util.Iterator;

public class ParseJSON {
    public static void main(String[] args) throws Exception {
        /*String jsonString = "{\r\n" + //
                "    \"name\" :{\r\n" + //
                "        \"firstName\" : \"Hamid\",\r\n" + //
                "        \"middleName\" : \"Razza\",\r\n" + //
                "        \"lastName\" : \"Ansari\"\r\n" + //
                "    },\r\n" + //
                "    \"contact\" : {\r\n" + //
                "        \"home\" : \"5533221177\",\r\n" + //
                "        \"work\" : \"6677221133\"\r\n" + //
                "    },\r\n" + //
                "    \"address\" : {\r\n" + //
                "        \"street\" : 20,\r\n" + //
                "        \"landmark\" : \"Near the temple\",\r\n" + //
                "        \"building\" : \"Nice Residency\",\r\n" + //
                "        \"country\" : \"India\"\r\n" + //
                "    },\r\n" + //
                "    \"age\" : 21,\r\n" + //
                "    \"relationship\" : \"single\"\r\n" + //
                "}";*/
        Object file = new JSONParser().parse(new FileReader("JSON/src/details.json"));
        JSONObject obj = (JSONObject) file;

        JSONObject nameObj = (JSONObject) obj.get("name");
        String firstName = (String) nameObj.get("firstName");
        String lastName = (String) nameObj.get("lastName");
        System.out.println(firstName + " " + lastName);

        long age = (long) obj.get("age");
        System.out.println(age);

        /*JSONObject nameObj = (JSONObject) obj.get("name");
        String firstName = (String) nameObj.get("firstName");
        String middleName = (String) nameObj.get("middleName");
        String lastName = (String) nameObj.get("lastName");
        long age = (long) obj.get("age");

        System.out.println("Name: " + firstName + " " + middleName + " " + lastName + " and age: " + age);*/

    }
}
