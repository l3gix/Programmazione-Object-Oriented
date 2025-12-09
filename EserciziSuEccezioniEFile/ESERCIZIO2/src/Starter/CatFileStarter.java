package Starter;

import GestioneFile.CatFile;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CatFileStarter
{
    public static void main(String[] args)
    {
        File Destinazione = new File("Destinazione.txt");
        PrintWriter out;
        try {
             out = new PrintWriter(Destinazione);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        JFrame frame = new JFrame("CatFile");
        JPanel panel = new JPanel();
        JLabel title = new JLabel("NomeFile :");
        JTextField nomeFile = new JTextField(10);
        JButton button = new JButton("Leggi");

        panel.add(title);
        panel.add(nomeFile);
        panel.add(button);

        button.addActionListener(e -> {
            CatFile catFile = new CatFile("src/file/" + nomeFile.getText() + ".txt");
            catFile.CatFileExecute(out);
            System.out.println("il file esiste");
            nomeFile.setText("");
        });

        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                out.close();
                System.out.println("Stream chiuso correttamente");
            }
        });

        //out.close();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
