package json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JsonBooleanTest {
    @Test
    public void testToJsonTrue() {
        JsonBoolean jsonBoolean = new JsonBoolean(true);
        assertEquals("true", jsonBoolean.toJson());
    }

    @Test
    public void testToJsonFalse() {
        JsonBoolean jsonBoolean = new JsonBoolean(false);
        assertEquals("false", jsonBoolean.toJson());
    }
}