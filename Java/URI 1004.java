import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x, y, PROD;
      x = sc.nextInt();
      y = sc.nextInt();
      PROD = x * y;
      System.out.println("PROD = " + PROD);
      sc.close();
  }
}