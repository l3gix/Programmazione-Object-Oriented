package classi;

public class DataSetCompare
{

    private Measurable min;
    private Measurable max;


    public DataSetCompare()
    {
        this.min = null;
        this.max = null;
    }


    public Measurable getMax()
    {
        return max;
    }

    public Measurable getMin()
    {
        return min;
    }

    public void add(Measurable m)
    {
        System.out.println(m.getMeasurable());

        if(min == null)min = m;
        else if(min.comparable(m) > 0) min = m;
        if(max == null)max = m;
        else if(max.comparable(m) < 0) max = m;
    }

}
