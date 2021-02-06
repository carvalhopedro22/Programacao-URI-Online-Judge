#include <stdio.h>
int main(void) {
  int N,horas,minutos,segundos;
  scanf("%d",&N);
  horas = N / 3600;
  minutos = N / 60 - (horas * 60);
  segundos = N - (minutos * 60 + horas * 3600); 
  printf("%d:%d:%d\n",horas,minutos,segundos);
  return 0;
}