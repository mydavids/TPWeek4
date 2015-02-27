package za.ac.cput.mydavids.designprinciples.singleresponsibilityprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.config.SingleRepConfig;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation.ClassAddAndDisplayImplService;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation.ClassCheckAndDisplayImplService;

/**
 * Created by student on 2015/02/24.
 */
public class SingleRepCorrectTest {

    ClassAddAndDisplayImplService classAdd;
    ClassCheckAndDisplayImplService classCheck;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SingleRepConfig.class);
        classAdd = (ClassAddAndDisplayImplService) ctx.getBean("ClassAdd");
        classCheck = (ClassCheckAndDisplayImplService) ctx.getBean("ClassCheck");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testSingleRepCorrect() throws Exception {
        classAdd.addStudent("John");
        classCheck.checkStudent("John");
    }
}
