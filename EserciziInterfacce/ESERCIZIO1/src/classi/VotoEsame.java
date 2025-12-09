package classi;

public class VotoEsame implements  Measurable
{
    private double punteggio;
    private String votoLettere;

    public  VotoEsame()
    {
        punteggio = 0;
        votoLettere = "";
    }

    public VotoEsame(double punteggio, String votoLettere)
    {
        this.punteggio = punteggio;
        this.votoLettere = votoLettere;
    }

    public double getPunteggio()
    {
        return punteggio;
    }

    public String getVotoLettere()
    {
        return votoLettere;
    }

    public void setPunteggio(double punteggio)
    {
        this.punteggio = punteggio;
    }

    public void setVotoLettere(String votoLettere)
    {
        this.votoLettere = votoLettere;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[punteggio="+punteggio+",votoLettere="+votoLettere+"]";
    }

    @Override
    public double getMesurable() {
        return punteggio;
    }

    @Override
    public String getMisurableS() {
        return votoLettere;
    }
}
