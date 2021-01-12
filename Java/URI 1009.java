import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String nome;
      double salario, montante, comissao, total;
      nome = sc.nextLine();
      salario = sc.nextDouble();
      montante = sc.nextDouble();
      comissao = montante * (15.0/100.0);
      total = salario + comissao;
      System.out.printf("TOTAL = R$ %.2f%n", total);
      sc.close();
  }
}