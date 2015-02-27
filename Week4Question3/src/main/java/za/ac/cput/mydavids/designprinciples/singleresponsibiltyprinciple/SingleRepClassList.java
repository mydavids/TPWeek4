package za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple;

/**
 * Created by student on 2015/02/24.
 */
public class SingleRepClassList {

    public void addStudent(String name){
        System.out.println(name + " is being been added");
    }

    public void checkStudent(String name){
        System.out.println(name + " is being searched for");
    }

}
