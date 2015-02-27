package za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.implementation;

import za.ac.cput.mydavids.designprinciples.singleresponsibiltyprinciple.service.ClassListService;

/**
 * Created by student on 2015/02/24.
 */
public class ClassAddAndDisplayImplService implements ClassListService {

    public void addStudent(String name){
        System.out.println("You are now adding: " + name);
        classList.add(name);
    }

    @Override
    public void displayStudent() {
        for (int i = 0; i < classList.size(); i++){
            System.out.println(classList.get(i));
        }
    }
}
