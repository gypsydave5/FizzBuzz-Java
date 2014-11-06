public class Fizzbuzz {

  protected boolean isDivisibleByThree(int number) {
    return isDivisibleBy(number, 3);
  }

  protected boolean isDivisibleByFive(int number) {
    return isDivisibleBy(number, 5);
  }

  protected boolean isDivisibleByFifteen(int number) {
    return isDivisibleBy(number, 15);
  }

  private boolean isDivisibleBy(int numerator, int denominator) {
    return numerator % denominator == 0;
  }

  public String fizzbuzz(int number) {
    return "2";

  }

}
