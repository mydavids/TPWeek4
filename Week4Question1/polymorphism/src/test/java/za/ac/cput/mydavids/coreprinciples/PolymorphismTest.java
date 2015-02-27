package za.ac.cput.mydavids.coreprinciples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/24.
 */
public class PolymorphismTest {

    Animal dog;
    Animal bird;

    @Before
    public void setUp() throws Exception {

        dog = new Dog("Dog", 5);
        bird = new Bird("Bird", 6);


    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetName() throws Exception {

        assertEquals(dog.getName(), "Dog");
        assertEquals(bird.getName(), "Bird");

    }

    @Test
    public void testGetAge() throws Exception {

        assertEquals(dog.getAge(), 5);
        assertEquals(bird.getAge(), 6);

    }

    @Test
    public void testSound() throws Exception {

        assertEquals(dog.sound(), "Bark");
        assertEquals(bird.sound(), "Chirp");
    }
}
