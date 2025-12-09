package punto4.tester;

import punto4.classi.Country;
import punto4.classi.OrdinaDataSet;

import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        OrdinaDataSet<String> o = new OrdinaDataSet<String>((obj1, obj2) ->
        {
            return obj1.compareTo(obj2);
        });

        o.add("x");
        o.add("y");
        o.add("a");
        o.ordina();
        ArrayList<String> ord = o.getData();
        System.out.println(ord);

        OrdinaDataSet<Country> cordina = new OrdinaDataSet<>((obj1, obj2) ->
        {
            return (int) (obj1.getMq()-obj2.getMq());
        });

        cordina.add(new Country("a",300));
        cordina.add(new Country("b",200));
        cordina.add(new Country("c",5));

        cordina.ordina();
        ArrayList<Country> c =  cordina.getData();
        System.out.println(c);

    }


}
