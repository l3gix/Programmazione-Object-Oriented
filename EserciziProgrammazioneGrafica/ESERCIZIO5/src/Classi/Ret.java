package Classi;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Ret extends JPanel {
    // Lista per memorizzare TUTTI i rettangoli
    private ArrayList<Rectangle> rettangoli;

    public Ret() {
        rettangoli = new ArrayList<>();
    }

    // Metodo per generare N rettangoli casuali
    public void disegnaRettangoli(int numero) {
        rettangoli.clear(); // Pulisci i rettangoli precedenti

        // Ottieni le dimensioni del PANNELLO
        int larghezzaPannello = getWidth();
        int altezzaPannello = getHeight();

        for (int i = 0; i < numero; i++) {
            // Genera dimensioni casuali
            int larghezza = 30 + (int)(Math.random() * 70);
            int altezza = 40 + (int)(Math.random() * 80);

            // Genera posizioni casuali DENTRO il pannello
            int x = (int)(Math.random() * (larghezzaPannello - larghezza));
            int y = (int)(Math.random() * (altezzaPannello - altezza));

            // Aggiungi il rettangolo alla lista
            rettangoli.add(new Rectangle(x, y, larghezza, altezza));
        }

        repaint(); // IMPORTANTE: ridisegna il pannello
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Disegna TUTTI i rettangoli nella lista
        g2.setColor(Color.BLACK);
        for (Rectangle rect : rettangoli) {
            g2.draw(rect);
        }
    }
}