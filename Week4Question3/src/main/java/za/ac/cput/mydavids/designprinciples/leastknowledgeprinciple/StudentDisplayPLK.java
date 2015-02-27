package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple;

/**
 * Created by student on 2015/02/27.
 */
public class StudentDisplayPLK {

    StudentPLK stud = new StudentPLK();

    public void display(String n, String num, float f){
        stud.addStudent(n, num, f);
        stud.displayStudent(num);
    }

}
