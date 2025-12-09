package punto2.classi;

public class ComparatorDataSet
{
    private Comparator c;
    private Object min;
    private Object max;

    public ComparatorDataSet(Comparator comparator)
    {
        c = comparator;
        min = null;
        max = null;
    }

    public void add(Object x)
    {
        if(min == null || c.compare(min, x) > 0)min = x;
        if(max == null || c.compare(max, x) < 0)max = x;
    }

    public Object getMin()
    {
        return min;
    }

    public Object getMax()
    {
        return max;
    }

}
