import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
    
      int tempo = num * 2;

      System.out.printf("%d minutos%n", tempo);
  }
}