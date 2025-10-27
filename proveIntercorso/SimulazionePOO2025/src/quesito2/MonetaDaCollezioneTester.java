package quesito2;

import questito1.Certificato;
import questito1.Ente;
import questito1.MonetaDaCollezione;

public class MonetaDaCollezioneTester
{
    public static void main(String[] args)
    {
        MonetaDaCollezione m = new MonetaDaCollezione(2,"2010",
                new Ente("zecca stato","via roma","zecca che conia le monete"),
                new Certificato(111,new Ente("zecca di stato","via napoli","ente certificato"),"descrione certficazione"));

        System.out.println(m);

        MonetaDaCollezione m2 = m.clone();
        System.out.println(m);

        if(m.equals(m2)) System.out.println("le monete sono uguali");
        else System.out.println("le monete non sono uguali");

        m.setValore(1);
        System.out.println("Ritorno il valore della moneta cambiato " + m.getValore());

        System.out.println(m);
        System.out.println(m2);

        if(m.equals(m2)) System.out.println("le monete sono uguali");
        else System.out.println("le monete non sono uguali");
    }
}
