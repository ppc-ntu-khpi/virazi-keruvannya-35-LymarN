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

   public static int Calculate() {
    
       /**
        * formula for calculating the Armstrong number
        */
    int num = 548;
    int temp = num;
    int res, summa = 0;
    while(num > 0){
        res = num % 10;
       num = num / 10;
        summa = summa +  res*res*res;   
    }
    /**
     * checking numbers as armstrong numbers
     * if the number meets the condition, we get a confirmation
     */
    if(temp != summa)
        System.out.println("This number is not Armstrong number");
    else 
        System.out.println("Its an Armstrong number");
    return temp ;
}
}
