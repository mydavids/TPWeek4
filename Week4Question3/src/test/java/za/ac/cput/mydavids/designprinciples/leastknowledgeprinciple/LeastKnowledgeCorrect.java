package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.config.AppConfig;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.implentation.StudentServiceImpl;
import za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple.service.StudentServicePLK;
import za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple.service.implementation.StudentServiceImplPLK;

/**
 * Created by student on 2015/02/27.
 */
public class LeastKnowledgeCorrect {

    StudentServiceImplPLK stud;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        stud = (StudentServiceImplPLK)  ctx.getBean("StudentServicePLK");

        stud = new StudentServiceImplPLK("Amy", "2134", 5000);
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
        stud.payment("2134", 1000);
        stud.display("2134");
    }
}
