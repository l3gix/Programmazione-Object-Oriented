public class Studenti
{
    private double somma_voti;
    private double numero_voti;

    //costruttore vuoto
    public Studenti()
    {
        this.somma_voti = 0;
        this.numero_voti = 0;
    }

    //costruttore con paramentri
    public Studenti(double somma_voti, double numero_voti)
    {
        if(somma_voti >= 18 && somma_voti <= 30)this.somma_voti = somma_voti;
        else System.out.println("il voto inserito non e valido");
        if(numero_voti >= 0)this.numero_voti = numero_voti;
        else  System.out.println("il numero di voti inserito non e valido");
    }

    //Medoti get

    public double getSommaVoti()
    {
        return this.somma_voti;
    }

    public double  getNumeroVoti()
    {
        return this.numero_voti;
    }

    //Metodi set

    public void setSommaVoti(double somma_voti)
    {
        if(somma_voti >= 18 && somma_voti <= 30)this.somma_voti = somma_voti;
        else System.out.println("il voto inserito non e valido");
    }

    public void setNumeroVoti(double numero_voti)
    {
        if(numero_voti >= 0)this.numero_voti = numero_voti;
        else  System.out.println("il numero di voti inserito non e valido");
    }

    //Metodi per modifica dello stato

    /**
     *
     * @param voto il nuovo voto da inserire e aumenta il counte del numero di voti
     */
    public void inserisciVoti(double voto)
    {
        if(voto >= 18 && voto <= 30)
        {
            somma_voti += voto;
            numero_voti++;
        }else System.out.println("il voto inserito non e valido");

    }

    /**
     *
     * @return ritorna la media dei voti quindi la somma dei voti divisa il numero dei voti
     */
    public double mediaVoti()
    {
        if(numero_voti <=  0 || somma_voti <= 0) return 0;
        else return somma_voti/numero_voti;
    }


    // Metodi per verificare lo stato

    public void printVoti()
    {
        System.out.println("\nVoti : ");
        System.out.println("Somma dei voti : " + somma_voti);
        System.out.println("Numero dei voti : " + numero_voti);
        System.out.println("Media dei voti : " + mediaVoti());
    }
}
