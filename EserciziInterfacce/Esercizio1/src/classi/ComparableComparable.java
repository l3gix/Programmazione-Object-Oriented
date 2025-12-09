package classi;

public class ComparableComparable implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        return ((Comparable)obj1).compareTo((Comparable)obj2);
    }
}
