package za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/27.
 */
public interface StudentService {

    public void setName(String n);
    public void setNumber(String num);
    public void setFees(float f);
    public String getName();
    public String getNumber();
    public float getFees();
    public List<StudentService> classList = new ArrayList<StudentService>();
}
