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
public class Animal {
      Scanner input = new Scanner (System.in);
   public Animal(){
   boolean valid3 = true;
   System.out.println("This is Where you View the Animal Information");
   System.out.println("----------------------------------------------------");
   System.out.println("   Display Animal Information Here");
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
           + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
           + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    System.out.println("---------------------------------------------------");
   System.out.println("Authorization Required to make any changes");
   System.out.println("If you are authorized to make changes\n"
           + "enter your acccess code or 0 to return to Navigation Page.: ");
    
        int pin = input.nextInt();
        System.out.println("---------------------------------------------------");
        while (valid3 == true){
        switch (pin){
           case 1111: System.out.println("Authorization Granted");
           System.out.println("Changes are made to Animal info here.");
           valid3 = false;
           break;
           case 2222: System.out.println("Authorization Granted");
           System.out.println("Changes are made to Animal info here.");
           valid3 = false;
           break;
           case 3333: System.out.println("Authorization Granted");
           System.out.println("Changes are made to Animal info here.");
           valid3 = false;
           break;
           case 0: 
           valid3 = false;
           break;
           case -1: System.out.println("Program Terminated by user.");
           valid3 = false;
           default: System.out.println("Invalid Pin Please try again or enter "
                   + "0 to return to Navigation Page.");
              pin = input.nextInt();
           break;
}
        }
        valid3 = true;
      System.out.println("Press any key to return to Navigation Page:");
         String sentinal = input.next();
          System.out.println("---------------------------------------------------");
   }
}
