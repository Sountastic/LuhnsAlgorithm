public class Luhn {

  boolean isNumberValid(int[] digits) {
    int sum = 0;
    boolean even = false;
    for (int i = digits.length - 1; i >= 0; i--) {
      int digit = digits[i];
      if (even) {
        digit *= 2;
        if (digit > 9) {
          digit = digit / 10 + digit % 10;
        }
      }
      sum += digit;
      even = !even;
    }
    return sum % 10 == 0;
  }
}
