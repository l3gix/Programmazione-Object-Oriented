package GestioneFile;

import classi.BanckAccount;

import java.io.*;

public class GestioneFile
{
    File f;
    ObjectInputStream ois;
    ObjectOutputStream oos;

    public GestioneFile(String f)
    {
        this.f = new File(f);

    }

    public boolean esite()
    {
        return f.exists();
    }

    public BanckAccount Carica()
    {
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            return (BanckAccount) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public void Scrivi(BanckAccount b)
    {
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(b);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
