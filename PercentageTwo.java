/******************************************

PercentageTwo class

********************************************/

public class PercentageTwo extends Percentage {

  // Overrides abstract method.
  public double findPercentage(double price, double discount) {

    double pDiscount = discount / 100;
    double firstDiscount = price * pDiscount;
    double finalDiscount = price - firstDiscount;

    return finalDiscount;

  }

  public void outputPrice(double price, double discount) {

    // Outputs to the console.
    System.out.println("Item with a price of $" + price +  " dollars and a discount of %" + discount + " percent has a final price of $" + findPercentage(price, discount) + " dollars");

  }

}
