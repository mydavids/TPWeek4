package za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.implentation;

import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentDisplay;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.StudentPayment;
import za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/27.
 */
public class StudentServiceImpl implements StudentService, StudentDisplay, StudentPayment {

    private String name;
    private String number;
    private float fees;

  //  private List<StudentServiceImpl> classList = new ArrayList<StudentServiceImpl>();


    public StudentServiceImpl(){

    }

    public StudentServiceImpl(String n, String num, float f){
        this.name = n;
        this.number = num;
        this.fees = f;

        classList.add(this);
    }



    @Override
    public void display(String num) {
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getNumber().equals(num)) {
                System.out.println("Name: " + classList.get(i).getName());
                System.out.println("Number: " + classList.get(i).getNumber());
                System.out.println("Fees owed:" + classList.get(i).getFees());
                break;
            }
            else{
                System.out.println("Student not found");
            }
        }
    }

    @Override
    public void payment(String num, float amt) {
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getNumber().equals(num)){
                float newAmt = 0;
                newAmt = classList.get(i).getFees() - amt;
                classList.get(i).setFees(newAmt);
                System.out.println("Payment made");
            }
            else{
                System.out.println("Payment unsuccessful");
            }
        }
    }

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public void setNumber(String num) {
        number = num;
    }

    @Override
    public void setFees(float f) {
        fees = f;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public float getFees() {
        return fees;
    }
}
