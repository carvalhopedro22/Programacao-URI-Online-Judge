#include <stdio.h>
int main(){
  int NUMBER,horas;
  scanf("%d %d",&NUMBER,&horas);
  float valor;
  scanf("%f",&valor);
  float SALARY;
  SALARY = horas * valor;
  printf("NUMBER = %d\n",NUMBER);
  printf("SALARY = U$ %.2f\n",SALARY);
  return 0;
}
