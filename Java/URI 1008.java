import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num, horas;
      double valor,salario;
      num = sc.nextInt();
      horas = sc.nextInt();
      valor = sc.nextDouble();
      salario = valor * horas;
      System.out.println("NUMBER = " + num);
      System.out.printf("SALARY = U$ %.2f%n", salario);
      sc.close();
  }
}