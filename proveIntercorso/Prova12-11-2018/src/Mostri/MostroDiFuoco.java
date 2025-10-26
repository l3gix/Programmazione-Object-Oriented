package Mostri;

public class MostroDiFuoco extends Mostro
{

    private int potenza;

    public MostroDiFuoco( String nome, int energia, int vitalita, int potenza)
    {
        super("Fuoco", nome, energia, vitalita);
        this.potenza = potenza;
    }

    public void attacca(Mostro m)
    {
        int energiaTolta = getEnergia() - potenza;
        if( getEnergia() > energiaTolta && energiaTolta >= 0 && getVitalita() > 0)
        {
            if (m.getTipo().equals("Acqua")) {
                setEnergia(energiaTolta);
                m.difendi();
            }
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + "[potenza=" + potenza + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o))return false;
        MostroDiFuoco m = (MostroDiFuoco)o;
        return  potenza == m.potenza;
    }
}
