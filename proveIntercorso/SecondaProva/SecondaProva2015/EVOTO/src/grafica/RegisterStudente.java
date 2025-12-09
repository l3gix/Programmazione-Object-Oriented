package grafica;

import classi.Esami;
import classi.ListaStudenti;
import classi.Studente;


import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterStudente extends JFrame
{
    private ListaStudenti studenti;
    private JTextField nome;
    private JTextField cognome;
    private JTextField matricola;
    private JTextField login;
    private JTextField password;
    private JComboBox pianoStudio;
    private JButton registrazione;
    public static final int WIDTH = 10;

    public RegisterStudente(ListaStudenti studente)
    {
        this.studenti = studente;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setTitle("Registrazione Studente");
        setSize(300,300);
        add(titlePanel(), BorderLayout.NORTH);
        add(mainPanel(), BorderLayout.CENTER);
        add(registrazionePanel(), BorderLayout.SOUTH);

    }

    private JPanel titlePanel()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Registrazione Studente"));

        return panel;
    }

    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1,5,5));
        panel.add(nome());
        panel.add(cognome());
        panel.add(matricola());
        panel.add(pianoStudio());
        panel.add(login());
        panel.add(password());
        return panel;
    }

    private JPanel registrazionePanel()
    {
        JPanel panel = new JPanel();
        registrazione = new  JButton("Registrazione");
        registrazione.addActionListener(e -> {
            Studente studente = new Studente();
            String nome_t =  nome.getText();
            String cognome_t = cognome.getText();
            String matricola_t = matricola.getText();
            String login_t = login.getText();
            String password_t = password.getText();
            String  piano_t = (String)pianoStudio.getSelectedItem();

            studente.setNome(nome_t);
            studente.setCognome(cognome_t);
            studente.setMatricola(matricola_t);
            studente.setLogin(login_t);
            studente.setPassword(password_t);
            studente.setEsami(valorizzaPianoStudi(piano_t));

            studenti.addStudente(studente);
            // implementare robba che prende dal file

            System.out.println(studenti.toString());
        });
        panel.add(registrazione);
        return panel;
    }

    //Da Fare
    private ArrayList<Esami> valorizzaPianoStudi(String nomeFile)
    {
        ArrayList<Esami> es = new ArrayList();
        try {
            FileReader fr = new FileReader("src/file/" + nomeFile );
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Esami esami = new Esami();
                esami.setInsegnamento(line);
                es.add(esami);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return  es;
    }



    private JPanel nome()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome"));

        nome =  new JTextField(WIDTH);
        panel.add(nome);

        return  panel;
    }

    private JPanel cognome()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Cognome"));


        cognome =  new JTextField(WIDTH);
        panel.add(cognome);
        return  panel;
    }

    private JPanel matricola()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Matricola"));


        matricola = new JTextField(WIDTH);
        panel.add(matricola);
        return  panel;
    }

    private JPanel login()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Login"));


        login = new JTextField(WIDTH);
        panel.add(login);
        return  panel;
    }

    private JPanel password()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Password"));


        password = new JTextField(WIDTH);
        panel.add(password);
        return  panel;
    }

    private JPanel pianoStudio()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Piano Studio"));


        pianoStudio = new JComboBox();
        pianoStudio.addItem("Reti.txt");
        pianoStudio.addItem("Sistemi.txt");
        pianoStudio.setSelectedItem("Reti.txt");
        panel.add(pianoStudio);
        return  panel;
    }





}
