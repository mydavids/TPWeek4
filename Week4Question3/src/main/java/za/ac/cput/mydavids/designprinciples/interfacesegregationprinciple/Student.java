package za.ac.cput.mydavids.designprinciples.interfacesegregationprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/27.
 */
public class Student {

    private String name;
    private String num;
    private float fees;

    private List<Student> classList = new ArrayList<Student>();

    public Student(){

    }

    public Student(String n, String num, float f){
        this.name = n;
        this.num = num;
        this.fees = f;

        classList.add(this);
    }

    public void display(String num){
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getNum().equals(num)) {
                System.out.println("Name: " + classList.get(i).getName());
                System.out.println("Number: " + classList.get(i).getNum());
                System.out.println("Fees owed:" + classList.get(i).getFees());
                break;
            }
            else{
                System.out.println("Student not found");
            }
        }
    }

    public void payment(String num, float amt){
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getNum().equals(num)){
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
}
