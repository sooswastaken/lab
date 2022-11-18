public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    printStars(20);
    printMults(8, 100);
  }


  // method printStars that, given an integer n prints n stars on a line with a space between each one.
  public static void printStars(int n) {
    for (int i = 0; i < n; i++) {
      System.out.print("* ");
    }
    System.out.println();
  }

  // Write a method printMults that when passed an integer num and an integer limit will print all the multiples of num up to limit (inclusive) on one line with spaces between them.
  public static void printMults(int num, int limit) {
    for (int i = 1; i <= limit; i++) {
      if (i % num == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

}
