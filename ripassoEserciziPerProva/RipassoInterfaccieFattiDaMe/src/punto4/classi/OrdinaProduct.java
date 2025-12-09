package punto4.classi;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdinaProduct <T>
{
    Comparator<T> cmp;

    public OrdinaProduct(Comparator<T> cmp)
    {
        this.cmp = cmp;
    }

    public void ordina(ArrayList<T> list)
    {
        for(int i = 0; i < list.size() - 1; i++)
        {
            for(int j = 0; j < list.size() - 1 -i ; j++)
            {
                if(cmp.compare(list.get(j), list.get(j+1)) > 0)
                {
                    T temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
