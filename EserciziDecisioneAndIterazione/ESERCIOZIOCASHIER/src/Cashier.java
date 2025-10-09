public class Cashier
{
    private double importo_pagare;
    private double importo_user;


    public Cashier()
    {
        this.importo_pagare = 0;
        this.importo_user = 0;
    }

    public void setAmountDue(double importo_pagare,double importo_user)
    {
        this.importo_pagare = importo_pagare;
        this.importo_user = importo_user;
    }



    public String receive()
    {
        String risultato = "";
        int resto = (int) ((importo_user - importo_pagare) * 100); // tutto in centesimi
        int quoziente;

        quoziente = resto / 200;
        resto = resto % 200;
        risultato = "Return " + quoziente + " da 2 Euro\n";

        quoziente = resto / 100;
        resto = resto % 100;
        risultato += "Return " + quoziente + " da 1 Euro\n";

        quoziente = resto / 50;
        resto = resto % 50;
        risultato += "Return " + quoziente + " da 50 centesimi\n";

        quoziente = resto / 20;
        resto = resto % 20;
        risultato += "Return " + quoziente + " da 20 centesimi\n";

        quoziente = resto / 10;
        resto = resto % 10;
        risultato += "Return " + quoziente + " da 10 centesimi\n";

        quoziente = resto / 5;
        resto = resto % 5;
        risultato += "Return " + quoziente + " da 5 centesimi\n";

        quoziente = resto / 2;
        resto = resto % 2;
        risultato += "Return " + quoziente + " da 2 centesimi\n";

        quoziente = resto / 1;
        resto = resto % 1;
        risultato += "Return " + quoziente + " da 1 centesimo\n";

        return risultato;
    }



}
