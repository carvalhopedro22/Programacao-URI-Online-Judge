import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
    
      int horas = N / 3600;
      int minutos = N / 60 - (horas * 60);
      int segundos = N - (minutos * 60 + horas * 3600);
      
      System.out.printf("%d:%d:%d\n",horas,minutos,segundos);
  }
}