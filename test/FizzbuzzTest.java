import static org.junit.Assert.*;
import org.junit.Test;

public class FizzbuzzTest {
  @Test
  public void thisAlwaysPasses() {
  }

  @Test
  public void threeTests() {

    Fizzbuzz fizzbuzz = new Fizzbuzz();
    assertTrue("It knows that three is divisible by three", fizzbuzz.isDivisibleByThree(3));
    assertFalse("It knows that four is not divisible by three", fizzbuzz.isDivisibleByThree(4));
  }
}
