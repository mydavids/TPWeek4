package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public class Dog extends Animal {

    public Dog(String n, int a) {
        super(n, a);
    }

    @Override
    public String sound() {
        System.out.println("Dog: Bark Bark");
        return "Bark";
    }
}
