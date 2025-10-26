package Test;

import Combattimento.Combattimento;
import Mostri.MostriDiAcqua;
import Mostri.MostroDiFuoco;
import Mostri.MostroDiPietra;

import java.util.Random;

public class TesterCombattimento
{
    public static void main(String[] args)
    {
        Combattimento c = new Combattimento();
        Random r = new Random();
        for(int i = 0; i < 3 ; i++)
        {
            c.aggiungiMosto(new MostroDiFuoco("mostro"+i,r.nextInt(40,50),r.nextInt(10,40),r.nextInt(0,10)));
            c.aggiungiMosto(new MostriDiAcqua("mostro"+i,r.nextInt(40,50),r.nextInt(10,40),r.nextInt(0,10)));
            c.aggiungiMosto(new MostroDiPietra("mostro"+i,r.nextInt(40,50),r.nextInt(10,40),r.nextInt(0,10)));
        }

        System.out.println(c);

        for(int i = 0; i < 20 ; i++)
        {
            c.combatti(r.nextInt(0,c.getSize()),r.nextInt(0,c.getSize()));
        }

        for(int i = 0; i < 200 ; i++)
        {
            c.combatti(r.nextInt(0,c.getSize()),r.nextInt(0,c.getSize()));
        }

        c.aggiungiMosto(new MostroDiFuoco("prova",0,0,100));

        System.out.println("Size attuale " + c.getSize());
        c.rimuovi();
        System.out.println("Size dopo la rimozione " + c.getSize());

        System.out.println(c);



    }
}
