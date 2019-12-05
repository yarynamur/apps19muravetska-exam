package json;

import org.junit.Test;

import static org.junit.Assert.*;

public class JsonNullTest {
    @Test
    public void testToJson() {
        JsonNull jsonNull = new JsonNull();
        assertEquals("null", jsonNull.toJson());
    }
}