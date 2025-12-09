import classi.ComparatorDataSet;
import classi.Country;
import classi.Comparator;

public class Tester
{
    public class NameCountryComparator implements  Comparator
    {

        @Override
        public int compare(Object obj1, Object obj2) {
            Country c1 = (Country)obj1;
            Country c2 = (Country)obj2;
            return c1.getNome().compareTo(c2.getNome());
        }
    }

    public static void main(String[] args)
    {




    }
}
