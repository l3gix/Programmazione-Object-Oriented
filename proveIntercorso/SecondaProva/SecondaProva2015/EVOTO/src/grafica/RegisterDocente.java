package grafica;

import classi.Docenti;
import classi.ListaDocenti;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class RegisterDocente extends JFrame
{
    private ListaDocenti docenti;

    private JTextField nome;
    private JTextField cognome;
    private JTextField login;
    private JTextField password;
    private JComboBox pianoStudio;
    private JButton registrazione;
    public static final int WIDTH = 10;

    public RegisterDocente(ListaDocenti docenti)
    {
        this.docenti = docenti;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        setTitle("Registrazione Studente");
        setSize(500,300);
        add(titlePanel(), BorderLayout.NORTH);
        add(mainPanel(), BorderLayout.CENTER);
        add(registrazionePanel(), BorderLayout.SOUTH);
    }


    private JPanel titlePanel()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Registrazione:"));

        return  panel;
    }

    private JPanel registrazionePanel()
    {
        JPanel panel = new JPanel();
        registrazione = new JButton("Registrazione");
        registrazione.addActionListener( e -> {
            Docenti docente =  new Docenti();

            String nome_t =  nome.getText();
            String cognome_t = cognome.getText();
            String login_t = login.getText();
            String password_t = password.getText();
            String  piano_t = (String)pianoStudio.getSelectedItem();

            docente.setNome(nome_t);
            docente.setCognome(cognome_t);
            docente.setLogin(login_t);
            docente.setPassword(password_t);
            docente.setInsegnamento(piano_t);

            docenti.addDocenti(docente);
            System.out.println(docenti);
        });
        panel.add(registrazione);

        return panel;
    }



    private JPanel mainPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1,5,5));
        panel.add(nome());
        panel.add(cognome());
        panel.add(pianoStudio());
        panel.add(login());
        panel.add(password());

        return  panel;
    }


    private JPanel nome()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Nome :"));
        nome = new JTextField(WIDTH);
        panel.add(nome);
        return panel;
    }

    private JPanel cognome()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Cognome :"));
        cognome = new JTextField(WIDTH);
        panel.add(cognome);
        return panel;
    }

    private void valorizzaPianoStudi(String nomeFile,ArrayList<String> s)
    {

        try {
            FileReader fr = new FileReader("src/file/" + nomeFile + ".txt");
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
                s.add(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    private JPanel pianoStudio()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Piano Studio :"));
        pianoStudio = new JComboBox();
        ArrayList<String> lista = new ArrayList();
        valorizzaPianoStudi("Reti", lista);
        valorizzaPianoStudi("Sistemi", lista);
        for(String s : lista)
        {
            pianoStudio.addItem(s);
        }
        pianoStudio.setSelectedIndex(0);
        panel.add(pianoStudio);

        return panel;


    }



    private JPanel login()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Login :"));
        login = new JTextField(WIDTH);
        panel.add(login);

        return panel;
    }

    private JPanel password()
    {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Password :"));
        password = new JTextField(WIDTH);
        panel.add(password);
        return panel;
    }
}
