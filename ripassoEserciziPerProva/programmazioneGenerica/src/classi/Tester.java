package classi;

import java.util.Arrays;
import java.util.Comparator;

public class Tester
{
    public  static void main(String[] args)
    {
        WithKey<String> []keys =(WithKey<String>[]) new WithKey[3];
        keys[0] = new Oggetto<String>("a","ccc");
        keys[1] = new Oggetto<String>("b","bb");
        keys[2] = new Oggetto<String>("c","a");

        Oggetto<String> t = (Oggetto<String>) Operazioni.find(keys,new Oggetto<String>("a","3"));
        System.out.println(t);

        //comparatore lunghezza Stringa
        Comparator<String> c = (o1, o2) -> {
            return o1.compareTo(o2);

        };
        Comparator<String> c1 = (o1,o2) ->
        {
            return o1.length()-o2.length();
        };

        //Operazioni.ordina(keys,c);
        Operazioni.ordina(keys,c1);
        System.out.println(Arrays.toString(keys));

    }
}
