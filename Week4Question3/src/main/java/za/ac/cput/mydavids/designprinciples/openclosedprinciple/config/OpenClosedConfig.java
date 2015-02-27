package za.ac.cput.mydavids.designprinciples.openclosedprinciple.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.openclosedprinciple.service.StudentService;
import za.ac.cput.mydavids.designprinciples.openclosedprinciple.service.implementation.StudentServiceImpl;

/**
 * Created by student on 2015/02/24.
 */
public class OpenClosedConfig {

    @Bean(name="student")
    public StudentService getService(){
        return new StudentServiceImpl();
    }

}
