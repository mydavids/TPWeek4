package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple;

/**
 * Created by student on 2015/02/27.
 */
public class StudentPaymentPLK {

    StudentPLK stud = new StudentPLK();

    public void payment(String n, float f){
        stud.studentPayment(n, f);
    }
}
