/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operatorpractice;

/**
 *
 * @author class
 */
public class OperatorPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //TODO declare and intialize test scores as int .
        int testScore1= 90;
        int testScore2= 90;
        int testScore3= 89;
        
        
        //TODO display each test score , one per line 
        System.out.println("the score for test 1 is" +testScore1);
        System.out.println("the score for test 2 is " +testScore2);
        System.out.println("the score for test 3 is " + testScore3);
        
        
        
         int sum = testScore1 + testScore2 + testScore3;
          System.out.println("the sum is: " + sum );
         
         
        //TODo calculate the average of the test score 
        double average = sum/ 3 ;
        
        
         //TODO output the average 
        System.out.println("the average test score is " + average );
        
     
    }
    
}
