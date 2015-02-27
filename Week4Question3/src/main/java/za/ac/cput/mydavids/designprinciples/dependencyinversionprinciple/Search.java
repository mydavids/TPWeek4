package za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple;

/**
 * Created by student on 2015/02/26.
 */
public class Search {

    Student stud = new Student();

    public void checkStud(String num){
        boolean checkStudBool;

        checkStudBool = stud.searchClass(num);

        if(checkStudBool == true){
            System.out.print(num + " is a valid student number");
        }

    }


}
