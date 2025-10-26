package Combattimento;

import Mostri.Mostro;

import java.util.ArrayList;

public class Combattimento
{
    private ArrayList<Mostro> mostri ;
    public  Combattimento()
    {
        mostri = new ArrayList<>();
    }

    public void aggiungiMosto(Mostro m)
    {
        mostri.add(m);
    }

    public void combatti(int i,int j)
    {
        mostri.get(i).attacca(mostri.get(j));
    }

    public void rimuovi()
    {
        for (int i = mostri.size() - 1; i >= 0; i--) {
            if (mostri.get(i).getVitalita() == 0) {
                mostri.remove(i);
            }
        }
    }

    public int getSize()
    {
        return mostri.size();
    }
    @Override
    public String toString()
    {
        return getClass().getName() + "[mostri=" + mostri + "]";
    }


}
