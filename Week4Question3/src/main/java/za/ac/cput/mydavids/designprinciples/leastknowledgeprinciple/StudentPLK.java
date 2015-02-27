package za.ac.cput.mydavids.designprinciples.leastknowledgeprinciple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/02/27.
 */
public class StudentPLK {

    public List<StudentPLK> classList = new ArrayList<StudentPLK>();

    private String name;
    private String number;
    private float fees;

    public StudentPLK(){

    }

    public StudentPLK(String n, String num, float f){
        name = n;
        number = num;
        fees =f;
    }

    public void addStudent(String n, String num, float f){
        StudentPLK student = new StudentPLK(n, num, f);

        classList.add(student);
    }
    
    public void displayStudent(String num){
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

    public void studentPayment(String num, float f){
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).getNumber().equals(num)){
                float newAmt = 0;
                newAmt = classList.get(i).getFees() - f;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public float getFees() {
        return fees;
    }

    public void setFees(float fees) {
        this.fees = fees;
    }
}
