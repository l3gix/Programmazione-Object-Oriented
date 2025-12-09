package classi;

import java.util.Comparator;

public class Operazioni
{
    public  Operazioni()
    {

    }

    public static <T>  WithKey<T> find(WithKey<T> k[] , WithKey<T> trovare)
    {

        for(int i = 0; i < k.length; i++)
        {
            if(k[i].getKey().equals(trovare.getKey()))
            {

                return k[i];
            }
        }

        return null;
    }

    public static <T> void ordina(WithKey<T> k[] , Comparator<T> c)
    {
        for (int j = 0; j < k.length - 1; j++) {           // passate
            for (int i = 0; i < k.length - 1; i++) {       // confronti
                if (c.compare(k[i].getKey(), k[i + 1].getKey()) > 0) {
                    WithKey<T> t = k[i];
                    k[i] = k[i + 1];
                    k[i + 1] = t;
                }
            }
        }
    }
}
