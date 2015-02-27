package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service;

/**
 * Created by student on 2015/02/27.
 */
public interface StudentService {

    public void payment(String studNum, float amt);
    public boolean searchClass(String studNum);
    public void displayStudent();
    public String getName();
    public void setName(String name);
    public String getNumber();
    public void setNumber(String num);
    public float getFees();
    public void setOldFees(float f);
    public String getSurname();
    public void setSurname(String sur);
    public void setFees(float newFees);

}
