package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/27.
 */
public class LeastKnowledgeIncorrect {

    StudentDisplayPLK sd;
    StudentPaymentPLK sp;

    @Before
    public void setUp() throws Exception {

        sd = new StudentDisplayPLK();
        sp = new StudentPaymentPLK();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDisplay() throws Exception {
        sd.display("Amy", "2134", 6000);

    }

    @Test
    public void testPayment() throws Exception {
        sp.payment("2134", 1000);
    }
}
