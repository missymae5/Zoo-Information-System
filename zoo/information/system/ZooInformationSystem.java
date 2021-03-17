/*Development 2 Project
 * Programmer Melissa Costa
 * to present functional design of Zoo Information System
 */
package zoo.information.system;

import java.util.Scanner;

/**
 *
 * @author melis
 */
public class ZooInformationSystem {

  
  
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    boolean valid;
    int sentinal = 0;
    
    
     while (sentinal != -1){
    System.out.println("Zoo Information System Navigation Page");
    System.out.println("Choose an option by entering the number next to the "
            + "choices Below");
    System.out.println("1 Sales\n2 Schedule\n3 Employee Information\n"
            + "4 Animal Information\n5 Reports");
    System.out.println("------------------------------------------------");
    System.out.print("Enter one of the numbers above 1-5 or -1 to exit.: ");
       int choice = input.nextInt();
       valid = true;
       
  
       while (valid == true){
     
           switch (choice){
              case 1: System.out.println("You are now being directed to Sales.");
              Sales sales = new Sales ();
              valid = false;
              break;
              case 2: System.out.println("You are now being directed to the "
                      + "Schedule.");
              Schedule schedule = new Schedule();
              valid = false;
              break;
              case 3: System.out.println("You are now being directed to "
                      + "Employee Information.");
              Employee employee = new Employee();
              valid = false;
              break;
              case 4: System.out.println("You are now being directed to "
                      + "Animal Information.");
              Animal animal = new Animal ();
              valid = false;
              break;
              case 5: System.out.println("You are now being directed to Reports.");
              Reports reports = new Reports();
              valid = false;
              break;
              case -1: System.out.println("System Terminated by user.");
              sentinal = -1;
              valid = false;
              break;
              default: System.out.println("You entered an invalid number.");
              System.out.print("Enter one of the numbers above 1-5 or -1 to exit: ");
              choice = input.nextInt();
              break;
          }
          
            
     }
     

   }
   }
}

   
