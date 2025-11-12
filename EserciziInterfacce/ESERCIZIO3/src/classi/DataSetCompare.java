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
        else if(min.comparable(m.getMeasurable()) > 0) System.out.println(m.getMeasurable());
    }

}
