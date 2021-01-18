#include <stdio.h>
int main(void) {
  int X;
  double Y, consumo;
  scanf("%d",&X);
  scanf("%lf",&Y);
  consumo = X/Y;
  printf("%.3lf km/l\n",consumo);
  return 0;
}