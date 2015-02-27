package za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.cofiguration;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentDisplay;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentPayment;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.StudentService;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.implentation.StudentServiceImpl;

/**
 * Created by student on 2015/02/27.
 */
public class AppConfig {

    @Bean(name="StudentService")
    public StudentService getService(){
        return new StudentServiceImpl();
    }

    @Bean(name="StudentDisplay")
    public StudentDisplay getDisplay(){
        return new StudentServiceImpl();
    }

    @Bean(name="StudentPayment")
    public StudentPayment getPayment(){
        return new StudentServiceImpl();
    }

}
