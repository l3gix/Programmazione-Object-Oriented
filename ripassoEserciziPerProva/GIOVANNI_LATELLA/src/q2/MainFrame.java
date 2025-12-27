package q2;




import q1.Estrazione;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame
{
    private JButton libri;
    private JButton autori;
    private JTextArea area;
    private ArrayList<Libro> llibri;
    private ArrayList<Autore> lautori;
    private static final int ROW = 30;
    private static final int COL = 20;

    public  MainFrame(ArrayList<Libro> llibri, ArrayList<Autore> lautori)
    {
        this.llibri = llibri;
        this.lautori = lautori;
        setTitle("Estrazione");
        setSize(400,400);
        area =  new JTextArea(ROW,COL);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll,BorderLayout.EAST);
        add(buttonPanel(),BorderLayout.WEST);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private JPanel buttonPanel()
    {
        EstrazioneInformazione est = new EstrazioneInformazione();
        JPanel panel = new JPanel(new GridLayout(2,1));
        libri = new JButton("Libri");
        libri.addActionListener(e -> {
            area.append(est.estrai(llibri,new EstraiPerLibro()) + "\n");

        });

        autori = new JButton("Autori");
        autori.addActionListener(e -> {
            area.append(est.estrai(lautori,new EstraiPerAutore()) + "\n");
        });

        panel.add(libri);
        panel.add(autori);

        return panel;
    }

}
