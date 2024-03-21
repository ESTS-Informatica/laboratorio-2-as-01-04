import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyTest {
    private static final Property property1 = new Property("T3 Monte Belo", 150000.0);

    public PropertyTest() {}


    @Test
    public void testConstructor() {
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice());
    }

    @Test
    public void testToString() {
        System.out.println(property1);
    }
}
