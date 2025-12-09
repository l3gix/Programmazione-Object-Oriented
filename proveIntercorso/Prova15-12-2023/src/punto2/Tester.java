package punto2;

import punto1.Container;
import punto1.FullContainerException;
import punto1.ItemNotFoundException;
import punto1.Prodotto;

import java.io.*;
import java.sql.SQLOutput;

public class Tester
{
    public static void main(String[] args)
    {
        Container c;
        File f = new File("container.dat");
        if(f.exists())
        {
            FileInputStream fr = null;
            try {
                fr = new FileInputStream(f);
                ObjectInputStream in = new ObjectInputStream(fr);
                c = (Container) in.readObject();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }else
        {
            System.out.println("File not found\n instanzio un oggetto di tipo container");
            c = new Container(6);
            try {
                System.out.println("Inserisco 4 prodotti");
                c.add(new Prodotto("f",1));
                c.add(new Prodotto("g",2));
                c.add(new Prodotto("h",3));
                c.add(new Prodotto("i",5));
            } catch (FullContainerException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Utilizzo il metodo delete con un prodotto che e presente");
            Prodotto find = c.delete(new Prodotto("f",1));
            System.out.println("Elemento cancellato : " + find );

            System.out.println("Delete con un prodotto che non e presente");
            try {
                c.delete(new Prodotto("x", 1));
            }catch (ItemNotFoundException e)
            {
                System.out.println(e.getMessage());
            }


        }

    }
}
