package classi;

import java.util.ArrayList;

public class Studente
{
    private String nome;
    private String cognome;
    private String matricola;
    private String login;
    private String password;
    ArrayList<Esami> esami;

    public Studente()
    {
        esami = new ArrayList<>();
    }

    public Studente(String nome, String cognome, String matricola, String login, String password)
    {
        esami = new ArrayList<Esami>();
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.login = login;
        this.password = password;
    }

    public void addEsame(Esami e)
    {
        esami.add(e);
    }

    public Esami getEsame(int i)
    {
        return esami.get(i);
    }


    public Esami findEsamiByInsegnamento(String insegnamento)
    {
        for(Esami e: esami)
        {
            if(e.getInsegnamento().equals(insegnamento))return e;
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Esami> getEsami() {
        return esami;
    }

    public void setEsami(ArrayList<Esami> esami) {
        this.esami = esami;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola='" + matricola + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", esami=" + esami +
                '}';
    }
}
