package za.ac.cput.mydavids.designprinciples.dependecyinversionprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.config.AppConfig;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.StudentService;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.implementation.StudentImpl;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.Student;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/26.
 */
public class InversionCorrect {

    private StudentService student;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        student = (StudentService) ctx.getBean("StudentService");
        student.setName("Amy");
        student.setNumber("2134");
        student.setSurname("Mitchell");
        student.setOldFees(5000);

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDisplay() throws Exception {
        student.displayStudent();
    }

    @Test
    public void testPayment() throws Exception {
        student.payment("2134", 50);
        student.displayStudent();

    }

    @Test
    public void testSearch() throws Exception {
            student.searchClass("2134");

    }
}
