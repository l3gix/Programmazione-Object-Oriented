package punto3;

import punto1.Container;
import punto1.Prodotto;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class FrameGrafica extends JFrame
{
    private Container c;
    private JTextArea area;
    private JButton seleziona;
    private JComboBox comboBox;
    private JTextField primo;
    private JTextField seconda;


    public FrameGrafica()
    {
        setTitle("Prodotto");
        setSize(900,400);
        area = new JTextArea(30,30);
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll, BorderLayout.CENTER);
        add(mainPanel(), BorderLayout.NORTH);
    }

    public JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        comboBox = new JComboBox();
        comboBox.addItem("Preso compreso");
        comboBox.addItem("denominazione compresa tra due stringhe");
        comboBox.addItem("denominazione iniziante per una data lettera e peso maggiore di un peso");
        panel.add(comboBox);
        panel.add(selezionaPanel());

        return panel;
    }

    public JPanel selezionaPanel()
    {
        class EseguiListener implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                ArrayList<Prodotto> temp = null;
                String select = (String) comboBox.getSelectedItem();
                if(select.equals("Preso compreso"))
                {
                    area.setText("");
                    int min =  Integer.parseInt(primo.getText());
                    int max =  Integer.parseInt(seconda.getText());

                    class ComparatorMinMax implements Predicate<Prodotto>
                    {

                        @Override
                        public boolean test(Prodotto prodotto) {
                            if(prodotto.getPeso() > min &&  prodotto.getPeso() < max)
                            {
                                return true;
                            }else return false;
                        }
                    }

                    temp = c.select(new ComparatorMinMax());

                }else if (select.equals("denominazione compresa tra due stringhe"))
                {
                    area.setText("");
                    String min =  primo.getText().trim();
                    String max =  seconda.getText().trim();



                    temp = c.select(new Predicate<Prodotto>() {
                        @Override
                        public boolean test(Prodotto o) {
                            String denom = o.getDenominazione();
                            return denom.compareToIgnoreCase(min) >= 0 &&
                                    denom.compareToIgnoreCase(max) <= 0;
                        }
                    });
                }

                for(Prodotto p : temp) area.setText(p.toString() + "\n");
            }
        }
        JPanel panel = new JPanel();
        seleziona = new JButton("Selezionar");
        primo = new  JTextField(10);
        seconda = new JTextField(10);
        panel.add(primo);
        panel.add(seconda);
        panel.add(seleziona);
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Intervalli"));

        return panel;
    }


}
