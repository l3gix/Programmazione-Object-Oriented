package Tester;

import classi.Cerchio;

import javax.swing.*;
import java.awt.*;

public class CerchioTester
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Due Cerchi Colorati");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Cerchio rosa - colore standard
                Cerchio cerchioRosa = new Cerchio(0, 0, 100, Color.PINK);
                cerchioRosa.paintComponent(g);

                // Cerchio viola - colore personalizzato
                Color viola = new Color(138, 43, 226); // RGB personalizzato
                Cerchio cerchioViola = new Cerchio(0, 100, 100, viola);
                cerchioViola.paintComponent(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

    }
}
