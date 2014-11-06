import static org.junit.Assert.*;
import org.junit.Test;

public class FizzbuzzTest {

  @Test
  public void knowsThreeisDivisibleByThree() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertTrue("It knows that three is divisible by three", fizzbuzz.isDivisibleByThree(3));
  }

  @Test
  public void knowsThatFourIsNotDivisibleByThree() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertFalse("It knows that four is not divisible by three", fizzbuzz.isDivisibleByThree(4));
  }

  @Test
  public void knowsThatFiveIsDivisibleByFive() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertTrue("It knows that five is divisible by five", fizzbuzz.isDivisibleByFive(5));
  }

  @Test
  public void knowsThatSixIsNotDivisibleByFive() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertFalse("It knows that six is not divisible by five", fizzbuzz.isDivisibleByFive(6));
  }

  @Test
  public void knowsThatFifteenIsDivisibleByFifteen() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertTrue("It knows that fifteen is divisible by fifteen", fizzbuzz.isDivisibleByFifteen(15));
  }

  @Test
  public void knowsThatSixteenIsNotDivisibleByFifteen() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertFalse("It knows that sixteen is divisible by fifteen", fizzbuzz.isDivisibleByFifteen(16));
  }

  @Test
  public void returnsTwoWhenGivenTwo() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertEquals("It returns two when given two", "2", fizzbuzz.fizzbuzz(2));
  }
}
