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
public class Schedule {
   Scanner input = new Scanner (System.in);
   public Schedule(){
   boolean valid3 = true;
    System.out.println("----------------------------------------------------");
    System.out.println("              Schedule!");
   System.out.println("This is Where you View the Schedule");
   System.out.println("---------------------------------------------------");
   System.out.println("   Display Schedule Here");
   System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
           + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n"
           + "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    System.out.println("---------------------------------------------------");
   System.out.println("Authorization Required to edit schedule");
   System.out.print("If you are authorized to make changes "
           + "enter your acccess code:\n(enter 0 to return to Navigation Page or -1 to exit.: ");
        int pin = input.nextInt();
        while (valid3 == true){
        switch (pin){
           case 1111: System.out.println("Authorization Granted");
           System.out.println("Changes are made to schedule here.");
           valid3 = false;
           break;
           case 2222: System.out.println("Authorization Granted");
           System.out.println("Changes are made to schedule here.");
           valid3 = false;
           break;
           case 3333: System.out.println("Authorization Granted");
           System.out.println("Changes are made to schedule here.");
           valid3 = false;
           break;
           case 0: 
           valid3 = false;
           break;
           case -1: System.out.println("Program Terminated by user");
           System.exit(0);
           valid3 = false;
           break;
           default: System.out.print("Invalid Pin Please try again or 0 to return "
                   + "to Navigation Page "
                   + "-1 to exit.");
              pin = input.nextInt();
              System.out.println("---------------------------------------------------");
           break;
        }
   }
        System.out.println("---------------------------------------------------");
      System.out.println("Press any key to return to Navigation Page:");
         String sentinal = input.next();
}
}
