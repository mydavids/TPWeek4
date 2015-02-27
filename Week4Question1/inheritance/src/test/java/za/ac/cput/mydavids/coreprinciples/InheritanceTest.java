package za.ac.cput.mydavids.coreprinciples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/24.
 */
public class InheritanceTest {

    Cat meowmeow;
    Dog woofwoof;

    @Before
    public void setUp() throws Exception {
        meowmeow = new Cat();
        woofwoof = new Dog();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSetName() throws Exception {

        meowmeow.setName("Kitty");
        assertEquals(meowmeow.getName(), "Kitty");
        woofwoof.setName("Doggy");
        assertEquals(woofwoof.getName(), "Doggy");

    }

    @Test
    public void testGetName() throws Exception {

        meowmeow.setName("Kitty");
        assertEquals(meowmeow.getName(), "Kitty");
        woofwoof.setName("Doggy");
        assertEquals(woofwoof.getName(), "Doggy");

    }

    @Test
    public void testSetAge() throws Exception {

        meowmeow.setAge(2);
        assertEquals(meowmeow.getAge(), 4);
        woofwoof.setAge(4);
        assertEquals(woofwoof.getAge(), 12);

    }

    @Test
    public void testGetAge() throws Exception {

        assertEquals(meowmeow.getAge(), 4);
        assertEquals(woofwoof.getAge(), 12);

    }
}
