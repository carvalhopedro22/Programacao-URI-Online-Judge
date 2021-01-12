#include <stdio.h>
int main(){
  char NOME[50];
  double salario,montante,TOTAL;
  fgets(NOME,50,stdin);
  scanf("%lf %lf",&salario,&montante);
  TOTAL = salario + montante * 0.15;
  printf("TOTAL = R$ %.2lf\n",TOTAL);
  return 0;
}