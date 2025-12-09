package punto1;

public class Classificazione
{
    private int valore;
    private String Descrizione;

    public Classificazione(int valore, String Descrizione){
        this.valore = valore;
        this.Descrizione = Descrizione;
    }

    public int getValore(){
        return valore;
    }
    public String getDescrizione(){
        return Descrizione;
    }

}
