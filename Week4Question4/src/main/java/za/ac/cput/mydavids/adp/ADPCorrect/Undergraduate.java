package za.ac.cput.mydavids.adp.ADPCorrect;

/**
 * Created by student on 2015/02/28.
 */
public class Undergraduate implements Student {
    @Override
    public String getName() {
        return "Adam";
    }

    @Override
    public int getAge() {
        return 18;
    }

    @Override
    public String getType() {
        return "Undergraduate";
    }
}
