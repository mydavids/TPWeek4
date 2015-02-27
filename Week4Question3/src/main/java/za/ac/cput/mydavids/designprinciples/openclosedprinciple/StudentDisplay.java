package za.ac.cput.mydavids.designprinciples.openclosedprinciple;

/**
 * Created by student on 2015/02/24.
 */
public class StudentDisplay extends Student {

    Student stud = new Student();

    public void display() {
        System.out.println("student name: " + stud.name);
    }

    public void setName(String name) {
        stud.name = name;
    }
}
