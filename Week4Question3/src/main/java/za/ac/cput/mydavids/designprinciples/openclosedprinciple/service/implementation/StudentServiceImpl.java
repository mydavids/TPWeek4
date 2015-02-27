package za.ac.cput.mydavids.designprinciples.openclosedprinciple.service.implementation;

import za.ac.cput.mydavids.designprinciples.openclosedprinciple.service.StudentService;

/**
 * Created by student on 2015/02/24.
 */
public class StudentServiceImpl implements StudentService {

    private String name;

    @Override
    public void display() {

        System.out.println(getName());
    }

    public String getName(){

        return name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }
}
