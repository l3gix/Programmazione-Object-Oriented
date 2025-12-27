package q2;




public class EstraiPerAutore implements Estrazione<Autore>
{

    @Override
    public String estraiInfo(Autore valore) {
        return valore.getNome()+","+valore.getIndirizzo().getCitta();
    }
}
