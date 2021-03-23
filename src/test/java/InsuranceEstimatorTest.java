/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author antho
 */
public class InsuranceEstimatorTest {
    
    public InsuranceEstimatorTest() {
    }

    @org.junit.jupiter.api.Test
    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 33;
        double expResult = 465.0;
        double result = InsuranceEstimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testExceptionThrown1() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.calculateLifeInsurance(4);
        });
    }
    
    @Test
    public void testExceptionThrown2() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.calculateLifeInsurance(115);
        });
    }
}
