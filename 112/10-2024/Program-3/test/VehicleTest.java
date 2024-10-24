import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testEmptyConstructor() {
        Vehicle veh = new Vehicle();
        assertNotNull(veh);
    }

    @Test
    void testNonEmptyConstructor() {
        Vehicle veh = new Vehicle(true, 2, 1);
        assertAll("testing the non-empty constructor",
            () -> assertTrue(veh.hasEngine()),
            () -> assertEquals(2, veh.getNumWheels()),
            () -> assertEquals(1, veh.getCapacity())
        );
    }

    @Test
    void setEngine() {
        Vehicle veh = new Vehicle();
        veh.setEngine(true);
        assertTrue(veh.hasEngine());
    }

    @Test
    void setNumWheels() {
        Vehicle veh = new Vehicle();
        veh.setNumWheels(4);
        assertEquals(4, veh.getNumWheels());
    }

    @Test
    void setCapacity() {
        Vehicle veh = new Vehicle();
        veh.setCapacity(2);
        assertEquals(2, veh.getCapacity());
    }

    @Test
    void testToString() {
        Vehicle veh = new Vehicle(true, 2, 1);
        assertEquals("The Vehicle has an engine  true, with 2 wheels and can transport 1\n", veh.toString());
    }
}