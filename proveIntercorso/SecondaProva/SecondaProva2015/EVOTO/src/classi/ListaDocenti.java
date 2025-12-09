package classi;

import java.util.ArrayList;

public class ListaDocenti
{
    ArrayList<Docenti> docenti;

    public ListaDocenti()
    {
        docenti=new ArrayList();
    }

    public void addDocenti(Docenti doc)
    {
        docenti.add(doc);
    }

    @Override
    public String toString() {
        return "ListaDocenti{" +
                "docenti=" + docenti +
                '}';
    }
}
