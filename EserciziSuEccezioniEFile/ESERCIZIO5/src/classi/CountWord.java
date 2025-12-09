package classi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountWord
{
    private String word;
    private String input;
    private String output;

    public CountWord(String word,String input,String output)
    {
        this.word=word;
        this.input=input;
        this.output=output;
    }

    public void Count() {

        Scanner sc;
        FileReader file;
        PrintWriter out;
        try {
            file = new FileReader(input);
            sc = new Scanner(file);
            out = new PrintWriter(output);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            if (line.contains(word)) {
                System.out.println(line);
                out.println(line);
            }
        }

        sc.close();
        out.close();
        try {
            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
