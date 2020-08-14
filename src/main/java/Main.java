import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Luhn luhn = new Luhn();
    Scanner sc = new Scanner(System.in);
    String number = sc.nextLine();
    int[] digit = new int[number.length()];
    for (int i = 0; i < number.length(); i++) {
      digit[i] = number.charAt(i);
    }
    if (luhn.isNumberValid(digit)) {
      System.out.println("Number " + number + " is valid");
    } else {
      System.out.println("Number " + number + " is not valid");
    }
  }
}
