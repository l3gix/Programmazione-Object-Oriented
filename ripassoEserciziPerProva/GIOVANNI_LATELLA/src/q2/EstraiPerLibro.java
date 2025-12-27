package q2;



public class EstraiPerLibro implements Estrazione<Libro>
{

    @Override
    public String estraiInfo(Libro valore) {
       return valore.getTitolo() + "," + valore.getAutore();
    }
}
