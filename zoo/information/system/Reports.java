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
public class Reports {
         Scanner input = new Scanner (System.in);
   public Reports(){
   boolean valid4 = true;
   System.out.println("-------------------------------------------------");
      System.out.println("                 Reports!   ");
   System.out.println("Only Authorized users are permitted to access Reports.");
   System.out.print("If you are authorized user "
           + "please enter your acccess code or 0 to exit: ");
        int pin = input.nextInt();
         System.out.println("---------------------------------------------------");
        while (valid4 == true){
        switch (pin){
           case 1111: System.out.println("Authorization Granted");
           System.out.println("View and print reports here.");
           valid4 = false;
           break;
           case 2222: System.out.println("Authorization Granted");
           System.out.println("View and print reports here.");
           valid4 = false;
           break;
           case 3333: System.out.println("Authorization Granted");
           System.out.println("View and print reports here.");
           valid4 = false;
           break;
           case 0: 
           valid4 = false;
           break;
           case -1: System.out.println("Program terminated by user.");
           valid4 = false;
           System.exit(0);
           break;
           default: System.out.println("Invalid Pin Please try again or enter "
                   + "0 to return to the Navigation Page (");
              pin = input.nextInt();
           break;
}
        }
         System.out.println("---------------------------------------------------");
        System.out.println("Press any key to return to Navigation Page:");
         String sentinal = input.next();
   }
}

