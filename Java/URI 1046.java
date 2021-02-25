import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int tinicial,tfinal,tempo;
    tinicial = sc.nextInt();
    tfinal = sc.nextInt();
    
    if(tinicial < tfinal){
        tempo = tfinal - tinicial;
    }else{
        tempo = 24 - tinicial + tfinal;
    }
    System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
    sc.close();  
  }
}