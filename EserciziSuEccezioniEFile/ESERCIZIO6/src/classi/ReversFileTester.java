package classi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class ReversFileTester
{
    public static void main(String[] args)
    {

        RandomAccessFile file;
        ArrayList<String> lines = new ArrayList<>();
        try {
            file = new RandomAccessFile("src/data.txt","rw");

            String line;
            while(file.getFilePointer()<file.length())
            {
                line = file.readLine();
                if(line != null)
                {
                    line = reverseString(line);
                    lines.add(line);
                }
            }

            // Riscrivi il file dall'inizio
            file.seek(0);
            for (int i = 0; i < lines.size(); i++)
            {
                file.writeBytes(lines.get(i));
                if (i < lines.size() - 1) // Non aggiungere newline all'ultima riga se non c'era
                {
                    file.writeBytes("\n");
                }
            }

            // Tronca il file alla nuova lunghezza (importante se il file invertito è più corto)
            file.setLength(file.getFilePointer());

            System.out.println("File modificato con successo!");


            file.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static String reverseString(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
