package za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.ClassListService;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation.ClassAddAndDisplayImplService;
import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation.ClassCheckAndDisplayImplService;

/**
 * Created by student on 2015/02/24.
 */
public class SingleRepConfig {

    @Bean(name="ClassAdd")
    public ClassListService getClassAdd(){
        return new ClassAddAndDisplayImplService();
    }

    @Bean(name="ClassCheck")
    public ClassListService getClassCheck(){
        return new ClassCheckAndDisplayImplService();
    }
}
