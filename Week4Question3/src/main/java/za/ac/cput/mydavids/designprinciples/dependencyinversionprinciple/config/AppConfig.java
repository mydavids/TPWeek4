package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.StudentService;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.implementation.StudentImpl;

/**
 * Created by student on 2015/02/27.
 */
public class AppConfig {
    @Bean(name="StudentService")
    public StudentService getService(){
        return new StudentImpl();
    }

}
