import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int cod,qtd;
    double preço;
    cod = sc.nextInt();
    qtd = sc.nextInt();
    
    if(cod == 1){
        preço = qtd * 4.00;
    }else if(cod == 2){
        preço = qtd * 4.50;
    }else if(cod == 3){
        preço = qtd * 5.00;
    }else if(cod == 4){
        preço = qtd * 2.00;
    }else{
        preço = qtd * 1.50;
    }

    System.out.printf("Total: R$ %.2f%n",preço);
    sc.close();  
  }
}