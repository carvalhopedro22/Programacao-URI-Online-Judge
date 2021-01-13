import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double raio, VOLUME;
      raio = sc.nextDouble();
      VOLUME = (4.0/3.0) * (3.14159) * (raio * raio * raio);
      System.out.printf("VOLUME = %.3f%n", VOLUME);
      sc.close();
  }
}