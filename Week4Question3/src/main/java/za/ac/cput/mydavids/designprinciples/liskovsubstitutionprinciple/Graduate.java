package za.ac.cput.mydavids.designprinciples.liskovsubstitutionprinciple;

/**
 * Created by student on 2015/02/24.
 */
public class Graduate extends Student{

    public void raiseAggregate(){
        System.out.println("Aggregate is raised");

    }

    public void lowerAggregate(){
        System.out.println("Aggregate is lowered");

    }

}
