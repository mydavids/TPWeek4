package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation;

import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.GraduateService;

/**
 * Created by student on 2015/02/24.
 */
public class GraduateImpl implements GraduateService{

    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
