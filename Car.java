/*
This program will imitate a car wash. It will ask the user how many vehicles will be washed,
and how they will be washed. The program will then add up the total for each car and the total
of all the cars. The cost of interior cleaning is 12.50$, the cost of exterior cleaning is 7.50$
the cost of cleaning the tires is 5$, the cost of using an airdrying machine to dry the car is 2.50$,
the cost of hand hand drying is 3.75$.
*/

//John Diem & Simon Weed
//Project 6
//11/20/20

public class Car
{
   //Initializes private variables
   private boolean interior;
   private boolean exterior;
   private boolean tires;
   private boolean airDry;
   private boolean handDry;
   
   
   //Constructor for a car object
   public Car(boolean i, boolean e, boolean t, boolean a, boolean h)
   {
      interior = i;
      exterior = e;
      tires = t;
      airDry = a;
      handDry = h;
   }
   
   
   //method to calculate the price for each Car object
   public double price() {
     double total = 0;
     
     if (this.interior == true) {
       total += 12.50;
     }
     if (this.exterior == true) {
       total += 7.50;
     }
     if (this.tires == true) {
       total += 5;
     }
     if (this.airDry == true) {
       total += 2.50;
     }
     if (this.handDry == true) {
       total += 3.75;
     }
     
     return total;
     
   }
}
   