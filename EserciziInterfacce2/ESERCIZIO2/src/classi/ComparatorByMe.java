package classi;

public class ComparatorByMe implements Comparator
{

    @Override
    public int compare(Object obj1, Object obj2) {
        return ((Comparable)obj1).compareTo((Comparable)obj2);
    }
}


