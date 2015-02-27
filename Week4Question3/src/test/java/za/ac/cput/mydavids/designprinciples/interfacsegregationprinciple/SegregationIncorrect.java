package za.ac.cput.mydavids.designprinciples.interfacsegregationprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.Student;

/**
 * Created by student on 2015/02/27.
 */
public class SegregationIncorrect {

    Student stud;

    @Before
    public void setUp() throws Exception {

        stud = new Student("Amy", "2134", 5000);

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDisplay() throws Exception {
        stud.display("2134");

    }

    @Test
    public void testPayment() throws Exception {
        stud.payment("2134", 500);
        stud.display("2134");

    }
}
