package Mostri;

public class MostriDiAcqua extends Mostro
{
    private int temperatura;

    public MostriDiAcqua( String nome, int energia, int vitalita, int temperatura)
    {
        super("Acqua", nome, energia, vitalita);
        this.temperatura = temperatura;
    }

    public void attacca(Mostro m)
    {
        int energiaTolta =  getEnergia() - (temperatura / 3);
        if( getEnergia() > energiaTolta && energiaTolta >= 0  && getVitalita() > 0)
        {
            if (m.getTipo().equals("Pietra")) {
                setEnergia(energiaTolta);
                m.difendi();

            }
        }
    }


    @Override
    public String toString()
    {
        return super.toString() + "[temperatura=" + temperatura + "]";
    }

    @Override
    public boolean equals(Object o)
    {
        if(!super.equals(o))return false;
        MostriDiAcqua m = (MostriDiAcqua)o;
        return temperatura == m.temperatura;
    }

}
