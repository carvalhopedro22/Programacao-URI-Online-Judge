import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num,total,media;
        int contador,totalnum;
        totalnum = 0;
        total = 0;
        media = 0;

        for(contador = 1; contador <= 6; contador++){
            num = sc.nextFloat();
            if(num > 0){
                totalnum = totalnum + 1;
                total = total + num;
            }
        }
        media = total/totalnum;
        System.out.printf("%d valores positivos\n",+totalnum);
        System.out.printf("%.1f\n",media);
    }
}