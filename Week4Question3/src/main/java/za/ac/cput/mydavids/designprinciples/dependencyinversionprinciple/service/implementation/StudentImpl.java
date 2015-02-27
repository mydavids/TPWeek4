package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.implementation;

import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/27.
 */
public class StudentImpl implements StudentService {

    private List<StudentImpl> classList = new ArrayList();
    private String name;
    private String surname;
    private String studNum;
    private float fees;
    StudentImpl student;

    public StudentImpl(){

    }

    public StudentImpl(String n, String s, String sN, float f){

        name = n;
        surname = s;
        studNum = sN;
        fees = f;
        new StudentImpl(name, surname, studNum, fees);
        classList.add(student);
    }

    @Override
    public void payment(String studNum, float amt) {
        for (int i = 0; i < classList.size(); i++){
            if (classList.get(i).getNumber().equals(studNum)){
                float fees = 0;
                fees = classList.get(i).getFees();
                classList.get(i).setFees(fees - amt);
                break;
            }
        }
    }

    @Override
    public boolean searchClass(String studNum) {
        for(int i = 0; i < classList.size(); i++){
            if (classList.get(i).getNumber().equals(studNum)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void displayStudent() {
        System.out.println("Name: "  + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Number:" + this.getNumber());
        System.out.println("Fees Owed: " + this.getFees());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getNumber() {
        return studNum;
    }

    @Override
    public void setNumber(String num) {
        this.studNum = num;
    }

    @Override
    public float getFees() {
        return this.fees;
    }

    @Override
    public void setOldFees(float f) {
        this.fees = f;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String sur) {
        this.surname = sur;
    }

    @Override
    public void setFees(float newFees) {
        float mon = this.getFees() - newFees;
        this.fees = mon;
    }
}
