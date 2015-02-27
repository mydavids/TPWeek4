package za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation;

import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.ClassListService;

/**
 * Created by student on 2015/02/24.
 */
public class ClassCheckAndDisplayImplService implements ClassListService {

    public void checkStudent(String name){
        for(int i = 0; i < classList.size(); i++){
            if(classList.get(i).equals(name)) {
                System.out.println("Student has been found");
                break;
            }
            else{
                System.out.println("Student has not been found");
            }
        }
    }

    @Override
    public void displayStudent() {
        for(int i = 0; i < classList.size(); i++){
            System.out.println(classList.get(i));
        }
    }
}
