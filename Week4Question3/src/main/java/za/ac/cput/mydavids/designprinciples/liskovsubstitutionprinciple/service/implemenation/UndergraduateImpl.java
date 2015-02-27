package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.implemenation;

import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.GraduateService;
import za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple.service.UndergraduateService;

/**
 * Created by student on 2015/02/24.
 */
public class UndergraduateImpl implements UndergraduateService {

    @Override
    public void display() {
        System.out.println("Displaying student");
    }

    @Override
    public void delete() {
        System.out.println("Deleting Student");
    }
}
