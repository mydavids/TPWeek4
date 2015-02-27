package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public abstract class Animal {

    private String name;
    private int age;

    public Animal(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public abstract String sound();

}
