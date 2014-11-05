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
}
