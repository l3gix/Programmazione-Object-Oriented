package classi;

import java.util.ArrayList;

public class SelettoreStarter
{
    public static void main(String[] args)
    {
        ArrayList<Country> lista = new ArrayList<Country>();
        lista.add(new Country("Romania", 100));
        lista.add(new Country("Russia", 300));
        lista.add(new Country("Ukraine", 50));

        ArrayList<Country> selezion1,selezion2,selezion3;

        System.out.println("Utilizzo del Primo filtro controllo intervallo di valore tra 50 - 200");
        //primo filtro
        Selettore filtro1 = (obj) -> {
            Country c = (Country) obj;
            return (c.getSuperficie() >= 50 && c.getSuperficie() <= 200);
        };
        selezion1 = UsoSelettore.seleziona(lista,filtro1);
        System.out.println(selezion1);


        System.out.println("Utilizzo del secondo filtro controllo nomi di country che iniziano per la lettera R");
        //Secondo Filstro
        Selettore filtro2 = (obj  ) -> {
            Country c = (Country) obj;
            return c.getNome().charAt(0) == 'R';
        };
        selezion2 = UsoSelettore.seleziona(lista,filtro2);
        System.out.println(selezion2);


        System.out.println("Utilizzo del terzo filtro contro utilizzo i due controlli precedenti insieme");
        //terzo Filtro
        Selettore filtro3 = (obj) -> {
            Country c = (Country) obj;
            return (c.getSuperficie() >= 50 && c.getSuperficie() <= 200) && (c.getNome().charAt(0) == 'R');
        };

        selezion3 =  UsoSelettore.seleziona(lista,filtro3);
        System.out.println(selezion3);
    }
}
