package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.nio.cs.ext.COMPOUND_TEXT_Decoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/24.
 */
public class LiskovIncorrect {

    static List<Student> classList = new ArrayList();

    @Before
    public void setUp() throws Exception {

        classList.add(new Graduate());
        classList.add(new Student());
        classList.add(new Undergraduate());

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testLspViolation(){
        for(Student s: classList){
            s.raiseAggregate();
            s.lowerAggregate();
        }
    }


}
