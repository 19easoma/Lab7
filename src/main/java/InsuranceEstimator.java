
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho
 */
public class InsuranceEstimator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();

        double lifeInsuranceCost;
        try {
            lifeInsuranceCost = calculateLifeInsurance(age);
            
            System.out.println("Your estimate is $" + lifeInsuranceCost);
        } catch (InvalidAgeException ex) {
            System.out.println("You have entered an invalid age.");
        }
    }
    
    public static double calculateLifeInsurance(int age) throws InvalidAgeException {
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid age input.");
        }
        
        double insuranceCost = (5 * age) + 300;
        return insuranceCost;
    }
}