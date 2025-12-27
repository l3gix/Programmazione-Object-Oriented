package q1;

import allegati.Libro;

public class EstraiPerLibro implements Estrazione<Libro>
{

    @Override
    public String estraiInfo(Libro valore) {
       return valore.getTitolo()+ "," + valore.getAutore();
    }
}
