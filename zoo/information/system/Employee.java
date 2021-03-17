/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.information.system;

import java.util.Scanner;

/**
 *
 * @author melis
 */
public class Employee {
      Scanner input = new Scanner (System.in);
   public Employee(){
   boolean valid4 = true;
   System.out.println("------------------------------------------------");
      System.out.println("            Employee Info!   ");
   System.out.println("Only Authorized users are permitted to access employee info.");
   System.out.print("If you are authorized user "
           + "please enter your acccess code or 0 to return to Navigation Page: ");
        int pin = input.nextInt();
        System.out.println("------------------------------------------------");
        while (valid4 == true){
        switch (pin){
           case 1111: System.out.println("Authorization Granted");
           System.out.println("View and edit Employee info here.");
           valid4 = false;
           break;
           case 2222: System.out.println("Authorization Granted");
           System.out.println("View and edit Employee info here.");
           valid4 = false;
           break;
           case 3333: System.out.println("Authorization Granted");
           System.out.println("View and edit Employee info here.");
           valid4 = false;
           break;
           case 0: 
           valid4 = false;
           break;
           default: System.out.println("Invalid Pin Please try again or enter "
                   + "0 to return to the Navigation Page.");
              pin = input.nextInt();
              System.out.println("------------------------------------------------");
      
              valid4 = false;
           break;
}
        }
        System.out.println("Press any key to return to Navigation Page:");
         String sentinal = input.next();
         System.out.println("---------------------------------------------------"); 
   }
}
