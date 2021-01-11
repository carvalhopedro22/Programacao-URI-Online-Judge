import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double raio, A;
     raio = sc.nextDouble();
     A = (3.14159 * (raio * raio)); 
     System.out.printf("A=%.4f%n",A);
     sc.close();
  }
}