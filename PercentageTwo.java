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

}
