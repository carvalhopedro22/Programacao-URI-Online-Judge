import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int contPar = 0;
        int contImpar = 0;
        int contPositivos = 0;
        int contNegativos = 0;
        int num;
        for (int i = 0; i < 5; i++) {
        	num = sc.nextInt();
        	if (num % 2 == 0){
                contPar++;
            }else{
                contImpar++;
            }
        	if (num > 0){
               contPositivos++; 
            } else if(num < 0){
                 contNegativos++;
            }
        }
        System.out.println(contPar + " valor(es) par(es)");
        System.out.println(contImpar + " valor(es) impar(es)");
        System.out.println(contPositivos + " valor(es) positivo(s)");
        System.out.println(contNegativos + " valor(es) negativo(s)");
    }	
}