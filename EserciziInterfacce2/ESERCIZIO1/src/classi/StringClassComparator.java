package classi;

public class StringClassComparator implements Comparator
{
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = (String)obj1;
        String s2 = (String)obj2;
        return s1.length() - s2.length();
    }
}
