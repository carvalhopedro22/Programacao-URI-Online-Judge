#include <stdio.h>
int main(void) {
  int A,B;
  double qtd;
  scanf("%d",&A);
  scanf("%d",&B);
  qtd = (B / 12.0) * A;
  printf("%.3lf\n",qtd);
  return 0;
}