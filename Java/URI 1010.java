import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int cod1,cod2,n1,n2;
      double v1,v2,preço;
      
      cod1 = sc.nextInt();
      n1 = sc.nextInt();
      v1 = sc.nextDouble();
      
      cod2 = sc.nextInt();
      n2 = sc.nextInt();
      v2 = sc.nextDouble();
      
      preço = n1 * v1 + n2 * v2;

      System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,preço);
      sc.close();
  }
}