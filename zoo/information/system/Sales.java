/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.information.system;

import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author melis
 */
public class Sales {
   Scanner input = new Scanner (System.in);
   boolean valid2 = true;
   int sentinal = 0;
   public Sales (){
      System.out.println("------------------------------------------------");
      System.out.println("                Sales!   ");
      System.out.println("Please Choose an option below:");
      System.out.println("1 Ticket Sales\n2 Merchandise Sales\n3 Animal Feeding");
      System.out.println("------------------------------------------------");
      System.out.print("Enter 1-3 to continue: ");
         int choice = input.nextInt();
      System.out.println("-------------------------------------------------");   
       while (valid2 == true){ 
     
           switch (choice){
              case 1: System.out.println("You are now being directed to Ticket Sales.");
            System.out.println("This is where you purchse tickets.");
              valid2 = false;
              break;
              case 2: System.out.println("You are now being directed to "
                      + "Merchandise Sales.");
              System.out.println("Purchase merchandise here.");
              valid2 = false;
              break;
              case 3: System.out.println("You are now being directed to "
                      + "Animal Feeding.");
              System.out.println("Purchase Animal Feedings here.");
              valid2 = false;
              break;
              case -1: System.out.println("Program Terminated by user");
              System.exit(0);
              valid2 = false;
              break;
              default: System.out.println("You entered an invalid number.");
              System.out.print("Enter one of the numbers above 1-3 or -1 to exit: ");
              choice = input.nextInt();
              break;
   }
         
       }
       System.out.println("Press any key to return to Navigation Page");
         String sentinal = input.next();
         System.out.println("---------------------------------------------------"); 
   }
}
       
   
