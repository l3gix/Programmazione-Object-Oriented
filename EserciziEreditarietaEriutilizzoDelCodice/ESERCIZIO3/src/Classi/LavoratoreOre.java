package Classi;

public class LavoratoreOre extends Lavoratore
{
    private int num_ore;
    private double paga_per_ore;

    public LavoratoreOre(String nome,String cognome,int num_ore , double paga_per_ore,String tipo)
    {
        super(nome,cognome,tipo);
        this.num_ore = num_ore;
        this.paga_per_ore = paga_per_ore;
    }

    public int getNumOre()
    {
        return num_ore;
    }

    public double getPagaPerOre()
    {
        return  paga_per_ore;
    }

    public void setNumOre(int num_ore)
    {
        this.num_ore = num_ore;
    }

    public void setPagaPerOre(double paga_per_ore)
    {
        this.paga_per_ore = paga_per_ore;
    }


    public void calcolaStipendio()
    {
        double paga = 0;
        if(num_ore > 40 )
        {
            double staordinarie = num_ore-40;
            paga = (paga_per_ore*num_ore) + (staordinarie * paga_per_ore * 1.5);
        } else
        {
            paga = paga_per_ore*num_ore;
        }

        setStipendio(paga);
    }

    public String toString()
    {
        return super.toString() + "[num_ore=" +  num_ore + ", paga_per_ore=" + paga_per_ore + "]";
    }
}
