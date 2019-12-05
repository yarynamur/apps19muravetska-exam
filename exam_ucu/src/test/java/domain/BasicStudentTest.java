package domain;

import json.JsonObject;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class BasicStudentTest {

    @Test
    public void testToJsonObject() throws Exception {
        BasicStudent basicStudent = new BasicStudent("Hanna", "Gopko", 1);
        JsonObject jsonObject = basicStudent.toJsonObject();

        String expectedJSON = "{'name': 'Hanna', 'surname': 'Gopko', 'year': 1}";

        JSONAssert.assertEquals(expectedJSON, jsonObject.toJson(), true);
    }
}