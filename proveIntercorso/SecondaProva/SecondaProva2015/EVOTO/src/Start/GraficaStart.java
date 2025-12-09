package Start;

import classi.ListaDocenti;
import classi.ListaStudenti;
import classi.Studente;
import grafica.Login;

import javax.swing.*;

public class GraficaStart
{
    public static void main(String[] args)
    {
        ListaStudenti studenti = new ListaStudenti();
        Studente studente = new Studente();
        studente.setLogin("andrea");
        studente.setPassword("1234");
        studenti.addStudente(studente);
        ListaDocenti  docenti = new ListaDocenti();
        Login login = new Login(studenti, docenti);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
