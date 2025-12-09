package puntofattodame.classi;

import java.util.ArrayList;
import java.util.Comparator;

public class Oder <T>
{
    private ArrayList<T> lista;
    private T min;
    private T max;
    Comparator<T> cmp;

    public Oder(Comparator<T> cmp)
    {
        lista =new ArrayList<>();
        min = null;
        max = null;
        this.cmp = cmp;
    }

    public Oder(ArrayList<T> l,Comparator<T> cmp)
    {
        lista =l;
        min = null;
        max = null;
        this.cmp = cmp;
    }


    public ArrayList<T> getLista()
    {
        return lista;
    }

    public void add(T element)
    {
        findMinMax(element);
        boolean find = false;
        for(int i=0;i<lista.size();i++)
        {
            if(cmp.compare(element,lista.get(i))<0)
            {
                lista.add(i,element);
                find = true;
                break;
            }
        }
        if(!find) lista.add(element);
    }

    private void findMinMax(T element)
    {
        if(min==null || cmp.compare(min,element)>0) min =  element;
        if(max==null || cmp.compare(max,element)<0) max =  element;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
