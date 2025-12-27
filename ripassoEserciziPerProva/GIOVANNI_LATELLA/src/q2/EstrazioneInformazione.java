package q2;

import java.util.ArrayList;

public class EstrazioneInformazione
{


    public <T> String estrai(ArrayList<T> array, Estrazione<T> estrazione)
    {
        String risoluzione = "";
        for(T a : array)
        {
            risoluzione += estrazione.estraiInfo(a) + "\n";
        }

        return risoluzione;
    }
}
