package punto5;

import punto1.ComparatoreLunghezzaDescrizione;
import punto1.Ordinamento;
import punto3.BorsaPienaException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class FrameMoneta extends JFrame
{
    private JTextField numMoneta;
    private JTextField tagliaBorsa;
    private final int ROW = 10;
    private final int COL = 40;
    private JTextArea area;
    private JButton borsa;
    private Borsa b;

    public FrameMoneta()
    {
        setTitle("Borsa");
        add(mainPanel(), BorderLayout.NORTH);
        add(AreaPanel(), BorderLayout.CENTER);
        setSize(500, 400);

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        menubar.add(fileMenu());
    }

    private JMenu fileMenu()
    {
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(exitMenuItem());
        fileMenu.add(salvaMenuItem());
        return fileMenu;
    }

    private JMenuItem exitMenuItem()
    {
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        return exitMenuItem;
    }

    private  JMenuItem salvaMenuItem()
    {
        JMenuItem salvaMenuItem = new JMenuItem("salva");
        salvaMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                ObjectOutputStream out = null;
                try {
                    FileOutputStream f = new FileOutputStream("borsa.dat");
                    out = new ObjectOutputStream(f);
                    out.writeObject(b);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }finally {
                    try {
                        out.close();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }
                                        }

        );
        return salvaMenuItem;
    }

    private JPanel AreaPanel()
    {
        JPanel panel = new JPanel();
        area = new JTextArea(ROW, COL);
        area.setEditable(false);
        JScrollPane scrollBar = new JScrollPane(area);
        panel.add(scrollBar);
        return panel;
    }

    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        numMoneta = new JTextField(10);
        tagliaBorsa = new JTextField(10);
        panel.add(new JLabel("Num moneta :"));
        panel.add(numMoneta);
        panel.add(new JLabel("Taglia borsa :"));
        panel.add(tagliaBorsa);
        borsa = new JButton("Borsa");
        borsa.addActionListener(e ->
        {
            double valore;
            String ente;
            b = new Borsa(Integer.parseInt(tagliaBorsa.getText()));
            for(int i = 0; i < Integer.parseInt(numMoneta.getText()); i++)
            {
                int r = (int)(Math.random() * 3);
                int r2 = (int)(Math.random() * 2);
                if( r == 0) valore = 0.5;
                else if( r == 1) valore = 1;
                else valore = 2;

                if(r2 == 0) ente = "Banca d’Italia";
                else ente = "Deutsche Bundesbank";
                try {
                    b.addMoneta(new Moneta(valore,ente));
                } catch (BorsaPienaException ex) {
                    throw new RuntimeException(ex);
                }

                // ordina


            }

            try {
                ordinaMonete();
            } catch (BorsaPienaException ex) {
                throw new RuntimeException(ex);
            }

            //b.ordinaBorsa();
            System.out.println(b);
            for(int i =0 ; i < b.getSize() ; i++)
            {
                area.append(b.get(i).toString()+"\n");
            }

            mainPanel().revalidate();
            mainPanel().repaint();


        });
        panel.add(borsa);

        return panel;
    }

    private void ordinaMonete() throws BorsaPienaException {
        ArrayList<Moneta> m = new ArrayList<>();
        for(int i = 0; i < b.getSize() ; i++)
        {
            m.add(b.get(i));
            b.remove(b.get(i));
        }

        Ordinamento<Moneta> o = new Ordinamento<>(new ComparatoreLunghezzaDescrizione());
        o.ordina(m);

        for(Moneta moneta :m)b.addMoneta(moneta);
    }



}
