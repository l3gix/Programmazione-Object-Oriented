package Tester;



import Classi.Ret;
import javax.swing.*;
import java.awt.*;

public class RettTester
{
    public static void main(String[] args) {
        // UN SOLO FRAME invece di due
        JFrame frame = new JFrame("RettTester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout()); // Usa BorderLayout

        // Pannello superiore per input
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Number of Rectangles = "));
        JTextField t1 = new JTextField(10);
        inputPanel.add(t1);

        JButton draw = new JButton("Draw");
        inputPanel.add(draw);

        // Crea UN SOLO pannello Ret per disegnare
        Ret drawPanel = new Ret();
        drawPanel.setBackground(Color.LIGHT_GRAY);
        drawPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        // Action listener
        draw.addActionListener(e -> {
            try {
                int numRect = Integer.parseInt(t1.getText());
                if (numRect > 0) {
                    // Passa larghezza e altezza del pannello a Ret
                    drawPanel.disegnaRettangoli(numRect);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Inserire un numero valido");
            }
        });

        // Aggiungi i componenti al frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(drawPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}