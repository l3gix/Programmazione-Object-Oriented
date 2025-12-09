package punto2;

import punto1.ComparatoreLunghezzaDescrizione;
import punto1.Ordinamento;

import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Moneta> m = new ArrayList<>();
        m.add(new Moneta(1,"a"));
        m.add(new Moneta(1,"b"));
        m.add(new Moneta(3,"c"));

        Ordinamento<Moneta> o = new Ordinamento<>(new ComparatoreLunghezzaDescrizione());
        o.ordina(m);

        System.out.println(m);
    }
}
