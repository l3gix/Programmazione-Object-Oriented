package grafica;


import classi.ListaDocenti;
import classi.ListaStudenti;
import classi.Studente;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Login extends JFrame
{

    public static final int FIELD_WIDTH = 10;
    private JButton studente;
    private JButton Docente;
    private JButton accedi;
    private JTextField login;
    private JTextField password;
    private ListaStudenti studenti;
    private ListaDocenti docenti;

    public Login(ListaStudenti studenti,ListaDocenti docenti)
    {
        this.studenti = studenti;
        this.docenti = docenti;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(title(), BorderLayout.NORTH);
        panel.add(mainPanel(), BorderLayout.CENTER);
        panel.add(registazionePanel(), BorderLayout.SOUTH);

        add(panel);
        setTitle("Login");
        setSize(300,250);
    }

    private JPanel title()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Benvenuti nel sistema:"));
        return  panel;
    }

    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(loginPanel(),BorderLayout.CENTER);
        panel.add(accediPanel(),BorderLayout.SOUTH);
        return  panel;
    }

    private JPanel loginPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2, 5, 5)); // 2 righe, 2 colonne, gap di 5px

        // Prima riga: Login
        panel.add(new JLabel("Login"));
        login = new JTextField(FIELD_WIDTH);
        panel.add(login);

        // Seconda riga: Password
        panel.add(new JLabel("Password"));
        password = new JTextField(FIELD_WIDTH);

        panel.add(password);

        return  panel;
    }

    private JPanel accediPanel()
    {
        JPanel panel = new JPanel();
        accedi =  new JButton("Accedi");
        accedi.addActionListener(e -> {
            String login_t =  login.getText();
            String password_t = password.getText();

            if(studenti.equalsLogin(login_t) && studenti.equalsPassword(password_t)) System.out.println("fatooo brooo");
        });

        panel.add(accedi);

        return  panel;
    }

    private JPanel registazionePanel()
    {
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(),"Registazione"));
        studente = new JButton("Studente");
        studente.addActionListener(e -> {
            RegisterStudente r = new RegisterStudente(studenti);
            r.setVisible(true);
            dispose();
        });
        Docente = new JButton("Docente");
        Docente.addActionListener(e -> {
            RegisterDocente r = new RegisterDocente(docenti);
            r.setVisible(true);
            dispose();
        });

        panel.add(studente);
        panel.add(Docente);

        return  panel;

    }



}
