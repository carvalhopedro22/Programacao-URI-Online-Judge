import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int tempo = sc.nextInt();
      int velocidade = sc.nextInt();
    
      int distancia = tempo * velocidade;
      double gasto = distancia/12.0;

      System.out.printf("%.3f%n", gasto);
  }
}