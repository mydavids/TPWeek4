package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public class Dog extends Animal {

    private int age = 12;

    @Override
    public void setAge(int a) {
        age = a * 3;
    }

    @Override
    public int getAge() {
        return age;
    }
}
