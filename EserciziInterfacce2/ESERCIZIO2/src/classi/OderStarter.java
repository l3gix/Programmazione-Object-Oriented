package classi;

public class OderStarter
{
    public static void main(String[] args)
    {
        //Ordinamento in ordine lessicografico
        String []s = new String[2];
        s[0] = "c";
        s[1] = "b";

        Order o = new Order(s,new ComparatorByMe());
        o.sortOrder();
        System.out.println(o);

        // Ordine in base alla lunghezza della stringa
        String []l = new String[2];
        l[0] = "ccc";
        l[1] = "bbbb";

        //utilizzo funzione lambda per Comparare in base alla lunghezza
        Comparator len = (obj1,obj2)-> {
            String s1 = obj1.toString(),s2 = obj2.toString();
            return s1.length() - s2.length();
        };

        o =  new Order(l,len);
        o.sortOrder();
        System.out.println(o);

        Country [] c = new  Country[2];
        c[0] = new Country("A",3000);
        c[1] = new Country("B",200);

        o = new Order(c,new ComparatorByMe());
        o.sortOrder();
        System.out.println(o);

        //Ordine in base alla lunghezza delle della stringhe nome
        //Utilizzo di classi anonime in alternativa della classe lambda
        len =  new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                Country c1 = (Country)obj1,c2 = (Country)obj2;
                return c1.getNome().compareTo(c2.getNome());
            }
        };

        o  =  new Order(c,len);
        o.sortOrder();
        System.out.println(o);
    }
}
