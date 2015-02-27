package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public class Cat extends Animal{

    private int age = 4;

    @Override
    public void setAge(int a) {
       age = a * 2;
    }

    @Override
    public int getAge() {
        return age;
    }
}
