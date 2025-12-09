package classi;

import java.util.ArrayList;

public class ListaStudenti
{
    ArrayList<Studente> studenti;

    public ListaStudenti()
    {
        studenti = new ArrayList<>();
    }

    public void addStudente(Studente studente)
    {
        studenti.add(studente);
    }

    public Studente getStudente(int index)
    {
        return studenti.get(index);
    }

    public int getSize()
    {
        return studenti.size();
    }

    public Studente getStudenteByMatricola(String matricola)
    {
        for(Studente studente : studenti)
        {
            if(studente.getMatricola().equals(matricola)) return studente;
        }

        return null;
    }

    public Studente getStudenteByInsegnamento(String insegnamento)
    {
        for(Studente studente : studenti)
        {
            for(Esami studenteEsami : studente.getEsami())
            {
                if(studenteEsami.getInsegnamento().equals(insegnamento)) return studente;
            }
        }

        return null;
    }

    public ArrayList<String> getMatricole()
    {
        ArrayList<String> matricola = new ArrayList<>();
        for(Studente studente : studenti)
        {
            matricola.add(studente.getMatricola());
        }

        return matricola;
    }

    public boolean equalsLogin(String login)
    {
        for(Studente studente : studenti)
        {
            if(studente.getLogin().equals(login)) return true;
        }
        return false;
    }

    public boolean equalsPassword(String password)
    {
        for(Studente studente : studenti)
        {
            if(studente.getPassword().equals(password)) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ListaStudenti{" +
                "studenti=" + studenti +
                '}';
    }
}
