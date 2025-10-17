package it.unisa.lp2.money;

public class ContoCorrente
{
    private double amount;
    private static int codiceConto = 0;
    private int numeroConto;

    public ContoCorrente() {
        this.amount = 0.0;
        codiceConto++;
        this.numeroConto = codiceConto;
    }

    /**
     * come pre-condzione che l'importo sia >= 0
     * @param importo importo da inserire
     */
    public void deposita(double importo)
    {
        assert importo >= 0;
        if( importo < 0) throw new IllegalArgumentException("Importo negativo");
        this.amount += importo;
    }

    /**
     *  come pre-condizione che importo <= amount ovvero il saldo attuale
     * @param importo importo da prelevare
     */
    public void preleva(double importo)
    {
        assert importo >= 0;
        if(importo > amount) throw new IllegalArgumentException();
        amount -= importo;

    }


    /**
     *
     * @return ritorna il saldo
     */
    public double getSaldo()
    {
        return amount;
    }

    /**
     *
     * @return ritorna il numero di conto
     */
    public int getNumeroConto()
    {
        return numeroConto;
    }
}
