package za.ac.cput.mydavids.designprinciples.singleresponsibilityprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.SingleRepClassList;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.ClassListService;

/**
 * Created by student on 2015/02/24.
 */
public class SingleRepIncorrectTest {

    private SingleRepClassList myClass;

    @Before
    public void setUp() throws Exception {

            myClass = new SingleRepClassList();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testAddAndDisplay() throws Exception {

        myClass.addStudent("John");
        myClass.checkStudent("John");
    }
}
