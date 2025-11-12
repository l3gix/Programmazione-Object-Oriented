package classi;

//import java.util.Comparator;

public class MinMaxComparator
{
    private Object min;
    private Object max;
    private Comparator comp ;

    public MinMaxComparator(Comparator c )
    {
        comp = c;
        min = null;
        max = null;
    }


    public Object getMax()
    {
        return max;
    }

    public Object getMin()
    {
        return min;
    }

    public void add(Object m)
    {
        if(min == null)
        {
            min = m;
            max = m;
            return;
        }
        if(comp.compare(max,m) < 0) max = m;
        if(comp.compare(m,min) < 0) min = m;
    }
}
