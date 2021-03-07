import java.io.IOException;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    for(int i = 0; i < 6; i++){
        double valor = sc.nextDouble();
        if(valor > 0){
            contador = contador + 1;
        }
    }
    System.out.println(contador + " valores positivos");
  }
}