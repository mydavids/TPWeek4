package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple;

/**
 * Created by student on 2015/02/24.
 */
public class Student {

    public void display(){
        System.out.println("Student is being displayed");
    }

    public void delete(){
        System.out.println("Student is being deleted");
    }

    public void raiseAggregate(){
        System.out.println("Aggregate is raised");

    }

    public void lowerAggregate(){
        System.out.println("Aggregate is lowered");

    }
}
