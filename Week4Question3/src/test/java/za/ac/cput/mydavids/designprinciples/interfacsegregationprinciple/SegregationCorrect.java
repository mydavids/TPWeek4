package za.ac.cput.mydavids.designprinciples.interfacsegregationprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.cofiguration.AppConfig;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentDisplay;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentPayment;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.StudentService;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.implentation.StudentServiceImpl;

/**
 * Created by student on 2015/02/27.
 */
public class SegregationCorrect {

    StudentService student;
    StudentDisplay studentD;
    StudentPayment studentP;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        student = (StudentService) ctx.getBean("StudentService");
        studentD = (StudentDisplay) ctx.getBean("StudentDisplay");
        studentP = (StudentPayment) ctx.getBean("StudentPayment");

        student = new StudentServiceImpl("Amy", "2134", 5000);
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDisplay() throws Exception {
        studentD.display("2134");
    }

    @Test
    public void testPayment() throws Exception {
        studentP.payment("2134", 2000);
        studentD.display("2134");

    }
}
