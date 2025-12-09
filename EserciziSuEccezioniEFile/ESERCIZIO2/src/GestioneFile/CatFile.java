package GestioneFile;

import java.io.*;
import java.util.Scanner;

public class CatFile
{
    File f;
    public CatFile(String f)
    {
        this.f = new File(f);
    }

    public void CatFileExecute(PrintWriter pw)
    {
        if(!f.exists())
        {
            System.out.println("File  " + f.getName() + " not existe");
            return;
        }
        try {
            FileReader fr = new FileReader(f);
            Scanner sc = new Scanner(fr);

            while(sc.hasNextLine())
            {
                String s = sc.nextLine();
                System.out.println(s);
                pw.println(s);
            }
            pw.flush();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
