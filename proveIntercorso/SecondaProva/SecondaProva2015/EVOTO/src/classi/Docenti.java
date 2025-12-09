package classi;

public class Docenti
{
    private String nome;
    private String cognome;
    private String insegnamento;
    private String login;
    private String password;

    public Docenti()
    {
        nome = "";
        cognome = "";
        insegnamento = "";
        login = "";
        password = "";
    }

    public Docenti(String nome, String cognome, String insegnamento, String login, String password)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.insegnamento = insegnamento;
        this.login = login;
        this.password = password;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public void setInsegnamento(String insegnamento)
    {
        this.insegnamento = insegnamento;
    }

    public String getNome() {
        return nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCognome() {
        return cognome;
    }

    public String getInsegnamento() {
        return insegnamento;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Docenti{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", insegnamento='" + insegnamento + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
