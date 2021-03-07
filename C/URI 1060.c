#include <stdio.h>
int main(){
  int i, contador = 0;
  float valor;
  for(i = 1; i <= 6; i++){
      scanf("%f",&valor);
      if(valor >= 0){
          contador = contador + 1;
      }
  }
  printf("%d valores positivos\n",contador);
  return 0;
}