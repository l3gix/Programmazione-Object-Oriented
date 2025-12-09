package Start;

import classi.Docenti;
import classi.ListaStudenti;
import classi.Studente;
import grafica.RegisterEsame;

public class RegisterEsameTester
{
    public static void main(String[] args)
    {
        Docenti doc = new Docenti();
        ListaStudenti lista = new ListaStudenti();
        Studente studente = new Studente();
        studente.setMatricola("1235");
        lista.addStudente(studente);

        RegisterEsame r = new RegisterEsame(doc, lista);
    }
}
