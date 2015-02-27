package za.ac.cput.mydavids.designprinciples.openclosedprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/24.
 */
public class OpenClosedIncorrectTest {

    StudentDisplay stud;

    @Before
    public void setUp() throws Exception {

        stud = new StudentDisplay();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testIncorrectOpenClosed() throws Exception {

        stud.setName("Jamal");
        stud.display();
        stud.setName("Adam");
        stud.display();
        stud.setName("Been");
        stud.display();

    }
}
