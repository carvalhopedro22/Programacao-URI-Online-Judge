#include <stdio.h>
int main() {
    int valor,num,cont;
    cont=0;
    for(valor = 1; valor <= 5 ; valor ++){
        scanf("%d",&num);
        if(num % 2 == 0)
            cont ++;
    }
    printf("%d valores pares\n",cont);
    return 0;
}