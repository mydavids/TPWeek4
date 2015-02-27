package za.ac.cput.mydavids.designprinciples.openclosedprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.openclosedprinciple.config.OpenClosedConfig;
import za.ac.cput.mydavids.designprinciples.openclosedprinciple.service.implementation.StudentServiceImpl;

/**
 * Created by student on 2015/02/24.
 */
public class OpenClosedCorrectTest {

    StudentServiceImpl student;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(OpenClosedConfig.class);
        student = (StudentServiceImpl) ctx.getBean("student");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testCorrectOpenClosed() throws Exception {

        student.setName("Yusiry");
        student.display();

    }
}
