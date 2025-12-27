package q2;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        File autori = new File("autori.dat");
        File libri = new File("libri.dat");
        ArrayList<Autore> listaAutori = new ArrayList<Autore>();
        ArrayList<Libro> listaLibri = new ArrayList<>();

        if(!autori.exists())
        {
            Indirizzo ind = new Indirizzo("via","civico","cap","citta");
            for(int i = 0 ; i < 10 ; i++)
            {
                listaAutori.add(new Autore(i + "",ind));
            }

            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(autori));
                oos.writeObject(listaAutori);
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        if(!libri.exists())
        {
            Autore a = new Autore("Giovanni",new Indirizzo("via","civico","cap","citta"));
            for(int i = 0 ; i < 10 ; i++)
            {
                listaLibri.add(new Libro(a,"Libro" + i,20));
            }

            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(libri));
                oos.writeObject(listaLibri);
                oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        MainFrame main = new MainFrame(listaLibri,listaAutori);
    }
}
