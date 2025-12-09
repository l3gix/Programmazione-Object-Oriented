package grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class frameCalcolatrice extends JFrame
{
    JTextField area;
    JButton[] operazioni;
    JButton[] numeri;


    public frameCalcolatrice()
    {
        setTitle("Calcolatrice");
        setSize(400,400);
        area = new JTextField(10);
        operazioni = new JButton[5];
        numeri = new JButton[10];

        add(area, BorderLayout.NORTH);
        add(mainPanel(), BorderLayout.CENTER);
    }

    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        // ActionListener unico per i numeri
        ActionListener numberListener = e -> {
            JButton source = (JButton) e.getSource();
            area.setText(area.getText() + source.getText());
        };

        // Crea i pulsanti numerici
        for(int i = 1; i <= 9; i++)
        {
            numeri[i] = new JButton("" + i);
            numeri[i].setFont(new Font("Arial", Font.BOLD, 18));
            numeri[i].addActionListener(numberListener);  // Stesso listener per tutti
            panel.add(numeri[i]);

            if(i % 3 == 0 && i/3 <= 3)
            {
                String[] ops = {"+", "-", "*", "/"};
                operazioni[i/3 - 1] = new JButton(ops[i/3 - 1]);
                operazioni[i/3 - 1].setFont(new Font("Arial", Font.BOLD, 18));
                panel.add(operazioni[i/3 - 1]);
            }
        }

        numeri[0] = new JButton("0");
        numeri[0].setFont(new Font("Arial", Font.BOLD, 18));
        numeri[0].addActionListener(numberListener);  // Stesso listener
        panel.add(numeri[0]);

        return panel;



    }
}
