package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.config.LiskovSubConfig;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation.GraduateImpl;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation.UndergraduateImpl;

/**
 * Created by student on 2015/02/24.
 */
public class LiskovCorrect {

    UndergraduateImpl under;
    GraduateImpl grad;

    @After
    public void tearDown() throws Exception {


    }

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(LiskovSubConfig.class);
        under = (UndergraduateImpl) ctx.getBean("under");
        grad = (GraduateImpl) ctx.getBean("grad");

    }

    @Test
    public void testLiskovCorrect() throws Exception {

        under.display();
        grad.setName("Lelly");

    }
}
