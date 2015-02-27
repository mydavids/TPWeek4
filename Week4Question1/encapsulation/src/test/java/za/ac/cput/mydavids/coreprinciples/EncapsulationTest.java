package za.ac.cput.mydavids.coreprinciples;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/24.
 */
public class EncapsulationTest {

    Encapsulation object;
    @org.junit.Before
    public void setUp() throws Exception {
        object = new Encapsulation();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSetName() throws Exception {

        object.setName("Sam");
        assertEquals(object.getName(), "Sam");

    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(object.getName(), "Pam");
    }

    @Test
    public void testsetAge() throws Exception {
        object.setAge(25);
        assertEquals(object.getAge(), 25);
    }

    @Test
    public void testgetAge() throws Exception {

        assertEquals(object.getAge(), 24);
    }
}
