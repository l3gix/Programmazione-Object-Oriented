package grafica;

import classi.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class RegisterEsame extends JFrame
{
    private Docenti docente;
    private ListaStudenti listaStudenti;
    private JButton registrar;
    private JComboBox matricole;
    private JComboBox voto;

    public RegisterEsame(Docenti docente, ListaStudenti listaStudenti)
    {
        this.docente = docente;
        this.listaStudenti = listaStudenti;
        setTitle("Registra Esame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);
        add(titlePanel(), BorderLayout.NORTH);
        add(mainPanel(), BorderLayout.CENTER);
        add(buttonPanel(), BorderLayout.SOUTH);
        setVisible(true);
    }


    private JPanel titlePanel()
    {
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("Benvenuto Prof." + docente.getNome() + " " + docente.getCognome()));
        return  titlePanel;
    }

    private JPanel mainPanel()
    {
        JPanel mainPanel = new JPanel();
        ArrayList<String> m = listaStudenti.getMatricole();
        matricole = new JComboBox(m.toArray());
        voto = new JComboBox();
        for(int i = 1 ; i <= 30 ; i++)
        {
            voto.addItem(i + "");
        }

        voto.addItem("30 e lode");
        mainPanel.setLayout(new GridLayout(2,2));
        mainPanel.setBorder(new TitledBorder(new EtchedBorder(),"Registra Esame"));
        mainPanel.add(new JLabel("Matricola studete:"));
        mainPanel.add(matricole);
        mainPanel.add(new JLabel("Voto :"));
        mainPanel.add(voto);



        return mainPanel;

    }

    private JPanel buttonPanel()
    {
        JPanel buttonPanel = new JPanel();
        registrar = new JButton("Registrar");
        buttonPanel.add(registrar);
        registrar.addActionListener(e ->
        {
            Studente studente = listaStudenti.getStudenteByMatricola((String)matricole.getSelectedItem());
            Esami es =studente.findEsamiByInsegnamento(docente.getInsegnamento());
            if(es.getInsegnamento().equals(" ")) {

            }

        });
        return buttonPanel;
    }




}
