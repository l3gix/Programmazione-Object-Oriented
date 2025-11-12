package classi;

public class MinMaxTest
{
    public static void main(String[] args)
    {
        Comparator c = new Comparator() { // classe anonima che implementa l'interfaccia Comparator
            @Override
            public int compare(Object obj1, Object obj2) {
                    Country c1 = (Country)obj1;
                    Country c2 = (Country)obj2;
                    return c1.getNome().compareTo(c2.getNome());

            }
        };

        MinMaxComparator mc = new MinMaxComparator(c);
        mc.add(new Country("A",100));
        mc.add(new Country("B",200));


        System.out.println("Massimo " + mc.getMax());
        System.out.println("Minimo " + mc.getMin());


        Comparator c2 = (obj1, obj2) -> {
            String s1 = (String) obj1;
            String s2 = (String)obj2;
            return s1.length() - s2.length();
        };

        MinMaxComparator mc2 = new MinMaxComparator(c2);

        mc2.add("aa");
        mc2.add("b");

        System.out.println("Massimo " + mc2.getMax());
        System.out.println("Minimo " + mc2.getMin());


    }
}
