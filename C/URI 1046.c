#include <stdio.h>
 
int main(){ 
    int Inicial, Final;

    scanf("%d %d", &Inicial, &Final);
    if (Inicial > Final) { 
        printf("O JOGO DUROU %d HORA(S)\n", 24 - (Inicial - Final));
    } else if (Final > Inicial) {
        printf("O JOGO DUROU %d HORA(S)\n", Final - Inicial);
    } else {
        printf("O JOGO DUROU 24 HORA(S)\n");
    }
    return 0;
}