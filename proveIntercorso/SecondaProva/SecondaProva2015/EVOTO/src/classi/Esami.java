package classi;

public class Esami
{
    private String insegnamento;
    private double voto;
    private String data; // formato gg/mm/aa
    private Docenti docente;

    public Esami()
    {
        docente = new Docenti();
        insegnamento = docente.getInsegnamento();
        voto = 0;
        data = "";
    }

    public Esami(double voto,String data,Docenti docente)
    {
        this.voto = voto;
        this.data = data;
        this.docente = docente;
        insegnamento = docente.getInsegnamento();
    }

    public String getInsegnamento() {
        return insegnamento;
    }

    public void setInsegnamento(String insegnamento) {
        this.insegnamento = insegnamento;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Docenti getDocente() {
        return docente;
    }

    public void setDocente(Docenti docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Esami{" +
                "insegnamento='" + insegnamento + '\'' +
                ", voto=" + voto +
                ", data='" + data + '\'' +
                ", docente=" + docente +
                '}';
    }
}
