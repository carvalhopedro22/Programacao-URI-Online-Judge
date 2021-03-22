#include <stdio.h>
int main() {
    int contador,num;
    scanf("%d",&num);
    if(num % 2 == 0)
        num = num - 1;
    for(contador = 1; contador <= num; contador += 2)
        printf("%d\n",contador);
    return 0;
}