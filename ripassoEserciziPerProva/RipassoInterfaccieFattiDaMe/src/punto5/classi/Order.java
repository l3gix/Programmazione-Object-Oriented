package punto5.classi;

import java.util.ArrayList;
import java.util.Comparator;

public class Order
{

    public static <T> void oder(ArrayList<T> lista, Comparator<T> c)
    {
        for(int i=0;i<lista.size()-1;i++)
        {
            for(int j = 0; j < lista.size()-i-1;j++)
            {
                if(c.compare(lista.get(j),lista.get(j+1)) > 0)
                {
                    T temp = lista.get(j+1);
                    lista.set(j+1, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }

    }

    public static <T> ArrayList<T> findTopK(ArrayList<T> items, int k, Comparator<T> comp)
    {
        ArrayList<T> max = new ArrayList<>();
        oder(items, comp);
        for(int i = 0; i <  k  ; i++)
        {
           max.add(items.get(items.size()-i-1));
        }

        return max;
    }

}
