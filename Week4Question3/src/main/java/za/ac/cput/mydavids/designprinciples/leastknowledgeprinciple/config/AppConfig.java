package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple.service.StudentServicePLK;
import za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple.service.implementation.StudentServiceImplPLK;

/**
 * Created by student on 2015/02/27.
 */
public class AppConfig {

    @Bean(name="StudentServicePLK")
    public StudentServicePLK getService(){
        return new StudentServiceImplPLK();

    }
}
