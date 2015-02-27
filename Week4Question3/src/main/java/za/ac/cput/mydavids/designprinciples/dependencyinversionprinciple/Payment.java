package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple;

/**
 * Created by student on 2015/02/26.
 */
public class Payment extends Student{

    Student stud = new Student();

    public void makePayment(String num, float amt){
        stud.payment(num, amt);
    }

}
