import java.io.IOException;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (num % 2 == 1) {
        		System.out.println(num);
        		cont++;
        	}
    		num++;
        }
    }
}