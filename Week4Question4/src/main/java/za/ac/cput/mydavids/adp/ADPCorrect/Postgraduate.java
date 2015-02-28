package za.ac.cput.mydavids.adp.ADPCorrect;

/**
 * Created by student on 2015/02/28.
 */
public class Postgraduate implements Student {


    @Override
    public String getName() {
        return "Eve";
    }

    @Override
    public int getAge() {
        return 22;
    }

    @Override
    public String getType() {
        return "Postgraduate";
    }
}
