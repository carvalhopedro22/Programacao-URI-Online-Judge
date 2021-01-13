import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double A,B,C,T,CR,TP,Q,R;
      
      A = sc.nextDouble();
      B = sc.nextDouble();
      C = sc.nextDouble();

      T = ((A * C)/2);
      CR = (3.14159 * (C * C));
      TP = (((A + B)*C)/2);
      Q = B * B;
      R = A * B;

      System.out.printf("TRIANGULO: %.3f%n", T);
	  System.out.printf("CIRCULO: %.3f%n", CR);
	  System.out.printf("TRAPEZIO: %.3f%n", TP);
	  System.out.printf("QUADRADO: %.3f%n", Q);
	  System.out.printf("RETANGULO: %.3f%n", R);
      sc.close();
  }
}