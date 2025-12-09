package classi;

public class DataSet
{
    private double sum;
    private Measurable min;
    private Measurable max;
    private int count;

    public DataSet()
    {
        this.count = 0;
        this.min = null;
        this.max = null;
        this.sum = 0;
    }
    public double average()
    {
        if(count == 0)return 0;
        else return sum/count;
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
        sum = sum + m.getMesurable();
        if(count == 0 || min.getMesurable() > m.getMesurable()) min = m;
        if(count == 0 || max.getMesurable() < m.getMesurable()) max = m;
        count++;
    }

}
