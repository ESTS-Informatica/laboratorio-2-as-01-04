import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropertyTest {


    public PropertyTest() {}


    @Test
    public void testConstructor() {
        Property property1 = new Property("T3 Monte Belo", 150000.0);
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice());
    }

    @Test
    public void testToString() {
        Property property1 = new Property("T3 Monte Belo", 150000.0);
        System.out.println(property1);
    }
}
