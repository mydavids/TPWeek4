package za.ac.cput.mydavids.coreprinciples;

/**
 * Created by student on 2015/02/24.
 */
public abstract class Animal {

    private String name;


    public void setName(String n){
        name = n;
    }


    public String getName(){
        return name;
    }

    public abstract void setAge(int a);
    public abstract int getAge();



}
