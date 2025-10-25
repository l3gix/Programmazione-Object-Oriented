package Classi;

public class LavoratoreFisso extends Lavoratore
{
    private int paga_per_ore;

    public LavoratoreFisso(String nome,String cognome,int paga_per_ore,String tipo)
    {
        super(nome,cognome,tipo);
        this.paga_per_ore = paga_per_ore;
    }


    public int getPagaPerOre()
    {
        return paga_per_ore;
    }

    public void setPagaPerOre()
    {
        this.paga_per_ore = paga_per_ore;
    }


    public void calcolaStipendio()
    {
        double stipendio = paga_per_ore * 40;
        setStipendio(stipendio);
    }

    public String toString()
    {
        return super.toString() + "[paga_per_ore=" + paga_per_ore + "]";
    }
}
