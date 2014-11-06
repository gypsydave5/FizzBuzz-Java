public class Fizzbuzz {

  protected boolean isDivisibleByThree(int num) {
    return isDivisibleBy(num, 3);
  }

  protected boolean isDivisibleByFive(int num) {
    return isDivisibleBy(num, 5);
  }

  protected boolean isDivisibleByFifteen(int num) {
    return isDivisibleBy(num, 15);
  }

  private boolean isDivisibleBy(int numerator, int denominator) {
    return numerator % denominator == 0;
  }

}
