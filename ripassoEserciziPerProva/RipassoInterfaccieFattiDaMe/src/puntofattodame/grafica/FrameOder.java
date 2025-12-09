package puntofattodame.grafica;

import puntofattodame.classi.Oder;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

public class FrameOder extends JFrame
{
    private static final int FIELD_WIDTH = 10;
    private static final int HEIGH = 300;
    private static final int WIDTH = 300;
    private JButton esegui;
    private JTextArea area;
    private JTextField inserisci;

    public  FrameOder()
    {
        setSize(WIDTH,HEIGH);
        setTitle("Puntofattodame");
        area = new JTextArea(30,30);
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);
        add(panelInsertPanel(), BorderLayout.NORTH);
    }

    private JPanel panelInsertPanel()
    {
        JPanel panel = new JPanel();
        esegui = new JButton("Inserisci");
        inserisci = new  JTextField(FIELD_WIDTH);
        panel.add(new JLabel("Inserisci"));
        panel.add(inserisci);
        panel.add(esegui);

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        ArrayList<String> temp = new ArrayList<>();
        Oder<String> o = new Oder<>(temp,c);

        esegui.addActionListener(e -> {
            o.add(inserisci.getText());
            area.setText("minimo : " + o.getMin() + "\nMassimo : " + o.getMax() + "\nLista = " + o.getLista());
        });

        
        
        return panel;
    }

}
