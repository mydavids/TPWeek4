package za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple;

import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.StudentService;

/**
 * Created by student on 2015/02/27.
 */
public interface StudentDisplay extends StudentService {
    public void display(String num);
}
