/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Надюха
 */
public class Exercise {
/**
 * This method checks your number as Armstrong number.
 * @return the value of the number and the results of the check
 */
   public static int Calculate() {
    
    int n = 153, sum = 0, Arm = n, rem, digits = 0;
    while (n != 0) {
         digits++;
         n = n/10;
      }
      while (n != 0) {
         rem = n%10;
         sum = sum + digits*digits*digits;
         n = n/10;
      }
      if (Arm == sum) 
          System.out.println("Armstrong number"); 
       else 
       System.out.println("NOT Armstrong number"); 
          return Arm;
   }
}
