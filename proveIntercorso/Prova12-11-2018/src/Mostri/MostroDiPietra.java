package Mostri;

public class MostroDiPietra extends Mostro
{
    public int peso;

    public MostroDiPietra( String nome, int energia, int vitalita, int peso)
    {
        super("Pietra", nome, energia, vitalita);
        this.peso = peso;
    }

    public void attacca(Mostro m)
    {
        int energiaTolta = getEnergia() - (peso / 3);
        if( getEnergia() > energiaTolta && energiaTolta >= 0 && getVitalita() > 0)
        {
            if (m.getTipo().equals("Fuoco")) {
                setEnergia(energiaTolta);
            }
        }
    }

    @Override
    public String toString()
    {
        return super.toString() + "[peso=" + peso + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o))return false;
        MostroDiPietra m = (MostroDiPietra)o;
        return peso == m.peso;
    }
}
