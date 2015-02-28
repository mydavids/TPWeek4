package za.ac.cput.mydavids.adp.ADPIncorrect;

/**
 * Created by student on 2015/02/28.
 */
public class Student implements Person {
    @Override
    public String getName() {
        return "Adam";
    }

    @Override
    public int getAge() {
        return 18;
    }
}
