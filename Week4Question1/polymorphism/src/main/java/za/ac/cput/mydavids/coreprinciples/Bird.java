package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public class Bird extends Animal {

    public Bird(String n, int a) {
        super(n, a);
    }

    @Override
    public String sound() {
        System.out.println("Bird: Chirp Chirp");
        return "Chirp";
    }
}
