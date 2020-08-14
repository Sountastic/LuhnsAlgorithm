import org.junit.Assert;
import org.junit.Test;

public class LuhnsAlgorithmTestSuite {
  @Test
  public void checkIf92480IsValid() {
    //Given
    Luhn luhn = new Luhn();
    //When
    boolean isValid = luhn.isNumberValid(new int[92480]);
    //Then
    Assert.assertTrue(isValid);
  }
}
