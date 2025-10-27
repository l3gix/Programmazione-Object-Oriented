package Test;

import Certificatore.Certificato;
import Ente.Ente;
import Monete.MonetaConiata;
import Monete.MonetaDaCollezione;

public class MoneteDaCollezioneTester
{
    public static void main(String[] args)
    {
        MonetaDaCollezione moneta = new MonetaDaCollezione(2,2010,new Ente("zecca","Via Gioanni Verdi","ente che autorizza"),new Certificato(123 ,new Ente("Ciaoo","via giovanni amendoal " , "Ciaooop")),10);
        System.out.println("Instaza di una moneta da Collezione");
        System.out.println(moneta);
        //utilzzo del metodo clone
        MonetaConiata monetaClone =  moneta.clone();
        System.out.println("Utilizzo del metodo clone");
        System.out.println(monetaClone);

        //utilizzo del metodo equals
        if(moneta.equals(monetaClone)) System.out.println("Le monete sono uguali");
        else System.out.println("Le monete sono diverse");

        //utilizzi dei metodi di accesso
        System.out.println("valutazione della moneta " + moneta.getValutazione());
        //utilizzo del metodo di modifica
        moneta.setValutazione(moneta.getValutazione() + 1);
        System.out.println("Utilizzo del metodo di modifica con il nuovo valore " +  moneta.getValutazione());
    }
}
