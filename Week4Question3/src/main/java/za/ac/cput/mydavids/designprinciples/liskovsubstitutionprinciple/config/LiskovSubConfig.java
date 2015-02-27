package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.config;

import org.springframework.context.annotation.Bean;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.GraduateService;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.UndergraduateService;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation.GraduateImpl;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation.UndergraduateImpl;

/**
 * Created by student on 2015/02/24.
 */
public class LiskovSubConfig {

    @Bean(name="grad")
    public GraduateService getGrad(){
        return new GraduateImpl();
    }

    @Bean(name="under")
    public UndergraduateService getUnder(){
        return new UndergraduateImpl();
    }
}
