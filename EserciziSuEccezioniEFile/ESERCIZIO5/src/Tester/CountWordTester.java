package Tester;

import classi.CountWord;

import java.util.Scanner;

public class CountWordTester
{
    public static void main(String[] args)
    {
        String word,
                input_file;


        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il file dove contare le parole");
        input_file = sc.nextLine();
        System.out.println("Inserisci la parola da cercare");
        word = sc.nextLine();

        CountWord c = new CountWord(word,"src/"+input_file + ".txt","src/output_file.txt");
        c.Count();
    }
}
