package za.ac.cput.mydavids.designprinciples.dependecyinversionprinciple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.Payment;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.Search;
import za.ac.cput.mydavids.designprinciples.dependencyinversionprinciple.Student;

/**
 * Created by student on 2015/02/26.
 */
public class InversionIncorrect {

    Student studA;
    Student studB;

    @Before
    public void setUp() throws Exception {

        studA = new Student("Michael", "Janny", "2345", 5000);
        studB = new Student("Kim", "Possible", "5432", 7500);
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPayment() throws Exception {

        Payment pay = new Payment();
        pay.payment(studA.getStudNum(), 500);
        studA.displayStudent();
    }

    @Test
    public void testSearch() throws Exception {

        Search search = new Search();
        search.checkStud(studB.getStudNum());
        studB.displayStudent();
    }
}
