package classi;

import classi.Comparator;

public class MinMaxStater
{
    public static void main(String[] args)
    {
        class CountryComparator implements Comparator // classe interna
        {
            @Override
            public int compare(Object obj1, Object obj2) {
                Country c1 = (Country)obj1;
                Country c2 = (Country)obj2;
                return c1.getNome().compareTo(c2.getNome());
            }
        }


        Comparator comp1 = new ComparableComparable(); // Assegno il tipo di comparazione ora in oradine lessicografico

        MinMaxComparator c1 = new MinMaxComparator(comp1);

        c1.add("a");
        c1.add("b");

        System.out.println("Massimo " + c1.getMax());
        System.out.println("Minimo " + c1.getMin());

        Comparator comp2 = new StringClassComparator(); // Ordinamento Mediante la relazione della lunghezza

        MinMaxComparator c2 = new MinMaxComparator(comp2);

        c2.add("aa");
        c2.add("b");

        System.out.println("Massimo " + c2.getMax());
        System.out.println("Minimo " + c2.getMin());

        // country nel primo caso usare la stessa relazione della prima quindi inutile da provare usare ComparableComparable

        Comparator comp3 = new CountryComparator();
        MinMaxComparator c3 = new MinMaxComparator(comp3);

        c3.add(new Country("A",100));
        c3.add(new Country("B",200));


        System.out.println("Massimo " + c3.getMax());
        System.out.println("Minimo " + c3.getMin());

    }
}
