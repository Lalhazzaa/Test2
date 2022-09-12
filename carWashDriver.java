//Diem Weed
//Project 6
//11/20/20

import java.text.DecimalFormat;
import java.util.Scanner;
public class carWashDriver {
  public static void main(String[] args) {
    
    //Creates a scanner and asks how many cars the user wants
    int input;
    Scanner in = new Scanner(System.in);
    
    System.out.println("How many cars are going through the car wash?");
    input = in.nextInt();
    
    //Initializes variables for car input
    Car[] cars = new Car[input];
    int interior;
    boolean binterior;
    int exterior;
    boolean bexterior;
    int tires;
    boolean btires;
    int airdry;
    boolean bairdry;
    int handdry;
    boolean bhanddry = false;
    
    //Big for loop to loop through each car in array
    //Asks car in array what options they would like
    for (int i = 0; i < input; i++) {
      do {
        System.out.println("Does car " + (i+1) + " want the interior cleaned? (Press 1 for yes, 0 for no)");
        interior = in.nextInt();
      } while (interior != 1 && interior != 0);
      if (interior == 1) {
        binterior = true;
      } else {
        binterior = false;
      }
      
      do {
        System.out.println("Does car " + (i+1) + " want the exterior cleaned? (Press 1 for yes, 0 for no)");
        exterior = in.nextInt();
      } while (exterior != 1 && exterior != 0);
      if (interior == 1) {
        bexterior = true;
      } else {
        bexterior = false;
      }
      
      do {
        System.out.println("Does car " + (i+1) + " want the tires cleaned? (Press 1 for yes, 0 for no)");
        tires = in.nextInt();
      } while (tires != 1 && tires != 0);
      if (tires == 1) {
        btires = true;
      } else {
        btires = false;
      }
      
      do {
        System.out.println("Does car " + (i+1) + " want to be air dryed? (Press 1 for yes, 0 for no)");
        airdry = in.nextInt();
      } while (airdry != 1 && airdry != 0);
      if (airdry == 1) {
        bairdry = true;
        bhanddry = false;
      } else {
        bairdry = false;
      }
      
      //if statement to make air dry and hand dry mutually exclusive
      if (bairdry == false) {
        do {
          System.out.println("Does car " + (i+1) + " want to be hand dryed? (Press 1 for yes, 0 for no)");
          handdry = in.nextInt();
        } while (handdry != 1 && handdry != 0);
        if (handdry == 1) {
          bhanddry = true;
        } else {
          bhanddry = false;
        }

      }    
      
      //Declares all inputs to car object
      cars[i] = new Car(binterior, bexterior, btires, bairdry, bhanddry);
        
    }
    //Decimal format to allow for 2 decimal places for cash output
    DecimalFormat formatObject = new DecimalFormat("0.00");
    double total = 0;
    
    //Algorithm to add price of cars and total
    for (int i = 0; i < input; i++) {
      total += cars[i].price();
      System.out.println("The cost to wash car " + (i+1) + " is $" + formatObject.format(cars[i].price()));
    }
    
    System.out.println();
    System.out.println("The total revenue of the car wash today is $" + formatObject.format(total));

  }
}