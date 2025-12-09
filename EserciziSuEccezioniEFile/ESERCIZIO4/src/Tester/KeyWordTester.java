package Tester;

import classi.KeyWord;

import java.io.*;

public class KeyWordTester
{
    public static void main(String[] args) throws IOException {
        FileReader r;
        PrintWriter pw;
        KeyWord k = new KeyWord("visit");
        try {
            r = new FileReader("src/input_chiaro.txt");
            pw = new PrintWriter("src/output_chiaro.txt");
            int c;
            while((c = r.read()) != -1)
            {
                pw.print(k.getEncrypt((char)c));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        r.close();
        pw.close();

    }
}
