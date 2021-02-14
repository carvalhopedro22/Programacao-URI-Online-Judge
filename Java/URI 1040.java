import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      float n1 = sc.nextFloat();
      float n2 = sc.nextFloat();
      float n3 = sc.nextFloat();
      float n4 = sc.nextFloat();

      float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1))/10;
      System.out.printf("Media: %.1f%n",media);

      if(media >= 7){
          System.out.println("Aluno aprovado.");
      } else if(media < 5){
          System.out.println("Aluno reprovado.");
      } else{
          System.out.println("Aluno em exame.");
          float ne = sc.nextFloat();
          System.out.printf("Nota do exame: %.1f%n",ne);
          float mediaexam = (media + ne)/2;
          if(mediaexam >= 5){
              System.out.println("Aluno aprovado.");
          } else {
              System.out.println("Aluno reprovado.");
          }
          System.out.printf("Media final: %.1f%n",mediaexam);
      }
  }
}