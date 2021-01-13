import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();

      int num1num2 = (num1 + num2 + Math.abs(num1 - num2))/2;
      int num1num2num3 = (num1num2 + num3 + Math.abs(num1num2 - num3))/2;
      
      System.out.println(num1num2num3 + " eh o maior");
  }
}