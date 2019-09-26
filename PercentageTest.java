/********************************

PercentageTest class

*********************************/

import java.util.Scanner;


public class PercentageTest {

  public static void main(String[] args) {

    System.out.println("");
    System.out.println("#################### Running Program ########################");
    System.out.println("");

    Scanner input = new Scanner(System.in);
    // Builds object from the class PercentageTwo
    // in order to have access to methods and variables.
    PercentageTwo pObj = new PercentageTwo();

    double price;
    double discount;
    double finalPrice;
    int control;

    System.out.print("Enter -1 to quit program or press any key to run program: ");
    control = input.nextInt();
    System.out.println("");

    while(control != -1) {

      System.out.print("Enter price of item: ");
      price = input.nextDouble();
      System.out.println("");

      System.out.print("Enter discount of item: ");
      discount = input.nextDouble();
      System.out.println("");

      // Method call
      // using object name.
      // Takes two parameters.
      finalPrice = pObj.findPercentage(price, discount);
      pObj.outputPrice(price, discount);

      System.out.print("Enter -1 to quit program or else press any key to run program: ");
      control = input.nextInt();
      System.out.println("");

      if(control == -1) {

        System.out.println("Thanks for using this program");

      } else {

        System.out.println("YEAYYYYYYYYYYYYY, let's do this again");

      }

    }

    System.out.println("");
    System.out.println("#################### Exiting Program #########################");
    System.out.println("");

  }

}
