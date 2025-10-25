package Esercizio;

public class Manager extends Impiegato
{
    private String area_competenza;

    public  Manager(String nome, double retribuzione, String numero_conto, String incarico,String area_competenza)
    {
        super(nome,retribuzione,numero_conto,incarico); // richiama il costrutore di impiegato
        this.area_competenza = area_competenza;
    }

    // metodi getter
    public String getAreaCompetenza()
    {
        return area_competenza;
    }

    //metodi setter
    public void setAreaCompetenza(String area_competenza)
    {
        this.area_competenza = area_competenza;
    }

    // sovrascrittura metodi object

    @Override
    public String toString()
    {
        return super.toString() + "[area_competenza="+area_competenza+"]";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(!super.equals(obj))return false;
        Manager other = (Manager) obj;
        return area_competenza.equals(other.area_competenza);
    }

    @Override
    public Manager clone()
    {
        return (Manager)super.clone();
    }
}
