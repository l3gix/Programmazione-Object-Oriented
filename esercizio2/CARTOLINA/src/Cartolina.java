public class Cartolina
{
    private String mittente;
    private String destinatario;
    private String indirizzo;
    private String messaggio;

    public Cartolina()
    {
        mittente = "";
        destinatario = "";
        indirizzo = "";
        messaggio = "";
    }

    public Cartolina(String mittente, String  destinatario, String indirizzo, String messaggio)
    {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.indirizzo = indirizzo;
        this.messaggio = messaggio;
    }

    //Metodi Get

    public String getMittente()
    {
        return mittente;
    }

    public String getDestinatario()
    {
        return destinatario;
    }

    public String getIndirizzo()
    {
        return indirizzo;
    }

    public String getMessaggio()
    {
        return messaggio;
    }

    //Metodi Set

    public void setMittente(String mittente)
    {
        this.mittente = mittente;
    }

    public void setDestinatario(String destinatario)
    {
        this.destinatario = destinatario;
    }

    public void setIndirizzo(String indirizzo)
    {
        this.indirizzo = indirizzo;
    }

    public void setMessaggio(String messaggio)
    {
        this.messaggio = messaggio;
    }

    public void stampaCartolina()
    {
        System.out.println("Cartolina -------\n"
                + "Mittente : " + mittente
                + "\nDestinatario : " + destinatario
                + "\nIndirizzo : " + indirizzo
                + "\nMessaggio : " + messaggio + "\n");
    }
}
