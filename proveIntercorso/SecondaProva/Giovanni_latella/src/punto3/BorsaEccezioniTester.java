package punto3;

import allegati.Moneta;

public class BorsaEccezioniTester
{
    public static void main(String[] args)
    {
        Borsa b = new Borsa(1);
        try {
            b.addMoneta(new Moneta(1,"1"));
        } catch (BorsaPienaException e) {
            System.out.println(e.getMessage());
        }
        try {
            b.addMoneta(new Moneta(2,"2"));
        } catch (BorsaPienaException e) {
            System.out.println(e.getMessage());
        }

        try {
            b.remove(new Moneta(3, "3"));
        }catch(MonetaNonPresenteException e) {
            System.out.println(e.getMessage());
        }
    }
}
