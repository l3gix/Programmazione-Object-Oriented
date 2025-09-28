#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Conto
{
    double saldo;
    char inte[20];
}Conto;

Conto newConto(char intest[] , double saldo_)
{
    Conto c ;
    strcpy(c.inte,intest);
    c.saldo = saldo_;

    return c;
}

void deposita(Conto *c , double importo)
{   
    c->saldo += importo;
    
}

void preleva(Conto *c, double importo)
{
    if( c->saldo > importo )
    {
        c->saldo -= importo;
    }else printf("Saldo insufficiente \n");
}

int main()
{
    Conto conto = newConto("Mario Rossi", 500.0);

    printf("Intestatario: %s\n", conto.inte);
    printf("Saldo iniziale: %.2f\n", conto.saldo);

    deposita(&conto, 200.0);
    printf("Dopo deposito: %.2f\n", conto.saldo);

    preleva(&conto, 100.0);
    printf("Dopo prelievo: %.2f\n", conto.saldo);

    preleva(&conto, 700.0); // dovrebbe stampare "Saldo insufficiente"

    return 0;
}