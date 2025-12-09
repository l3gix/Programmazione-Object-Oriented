package punto3.classi;

import java.util.ArrayList;
import java.util.Comparator;

public class OderBook
{
    public static <T> void orderBook(ArrayList<T> lista, Comparator<T> cmp)
    {
        for(int i=0;i<lista.size() - 1 ;i++)
        {
            for(int j=0;j<lista.size() - 1 - i;j++)
            {
                if(cmp.compare(lista.get(j),lista.get(j+1)) > 0)
                {
                    T temp = lista.get(j);
                    lista.set(j,lista.get(j+1));
                    lista.set(j+1,temp);
                }
            }
        }
    }
}
