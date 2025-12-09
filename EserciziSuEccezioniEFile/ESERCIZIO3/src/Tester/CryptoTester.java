package Tester;

import classi.Decrypt;
import classi.Encrypt;

import java.io.*;
import java.util.Scanner;

public class CryptoTester
{
    public static void main(String[] args) throws IOException {
        final int key = 3;
        Encrypt e = new Encrypt(key);
        Decrypt d = new Decrypt(key);
        Scanner sc = new Scanner(System.in);
        String input_chiaro = "src/input_chiaro.txt",
                output_cript = "src/output_cript.txt",
                input_cript ="src/output_cript.txt",
                output_chiaro = "src/output_chiaro.txt";

        System.out.println("Inserisci il file di input in chiaro");
        input_cript = sc.nextLine();
        System.out.println("Inserisci il file dove andra output criptato");
        output_cript = sc.nextLine();
        System.out.println("Inserisci il file di input cryptato ");
        input_cript = sc.nextLine();
        System.out.println("Inserisci il file dove andra output decptato ");
        output_chiaro = sc.nextLine();

        //encrypt
        Reader in = new FileReader(input_chiaro);
        int c;
        String result = "";
        while(( c = in.read() )!= -1)
        {
            char crypt = e.getEncrypt((char)c);
            result += crypt;
        }
        in.close();
        //scriviamo sul file
        PrintWriter out = new PrintWriter(output_cript);
        out.print(result);
        out.close();

        result = "";

        in =  new FileReader(input_cript);
        while(( c = in.read() )!= -1)
        {
            char decryp = d.getDecrypt((char)c);
            result += decryp;
        }
        in.close();

        out = new PrintWriter(output_chiaro);
        out.print(result);
        out.close();
    }
}
