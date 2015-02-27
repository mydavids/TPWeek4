package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/26.
 */
public class Student {

    private String studName;
    private String studSurname;
    private String studNum;
    private float studFees;

    private List<Student> classList = new ArrayList<Student>();

    public Student(){

    }

    public Student(String sN, String sS, String sNu, float sF){

        Student stud = new Student();
        stud.studName = sN;
        stud.studSurname = sS;
        stud.studNum = sNu;
        stud.studFees = sF;

        classList.add(stud);
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudSurname() {
        return studSurname;
    }

    public void setStudSurname(String studSurname) {
        this.studSurname = studSurname;
    }

    public String getStudNum() {
        return studNum;
    }

    public void setStudNum(String studNum) {
        this.studNum = studNum;
    }

    public float getStudFees() {
        return studFees;
    }

    public void setStudFees(float studFees) {
        this.studFees = studFees;
    }

    public void displayStudent(){
            System.out.println("Name: "  + this.getStudName());
            System.out.println("Surname: " + this.getStudSurname());
            System.out.println("Number:" + this.getStudNum());
            System.out.println("Fees Owed: " + this.getStudFees());
    }

    public boolean searchClass(String num){
        for(int i = 0; i < classList.size(); i++){
            if (classList.get(i).getStudNum().equals(num)){
                return true;
            }
        }
        return false;
    }

    public void payment(String num, float amt){
        for (int i = 0; i < classList.size(); i++){
            if (classList.get(i).getStudNum().equals(num)){
                float fees = 0;
                fees = classList.get(i).getStudFees();
                classList.get(i).setStudFees(fees - amt);
                break;
            }
        }
    }

}
