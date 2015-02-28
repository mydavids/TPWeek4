package za.ac.cput.mydavids.adp.ADPIncorrect;

/**
 * Created by student on 2015/02/28.
 */
public class Undergraduate extends Student implements Person {
    @Override
    public String getName() {
        return "Eve";
    }

    @Override
    public int getAge() {
        return 18;
    }
}
