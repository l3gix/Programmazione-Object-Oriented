package Start;

import classi.ListaDocenti;
import classi.ListaStudenti;
import grafica.RegisterDocente;

import javax.swing.*;

public class RegisterDocenteTester
{
    public static void main(String[] args)
    {
        ListaDocenti lista = new ListaDocenti();
        RegisterDocente reg = new RegisterDocente(lista);
        reg.setVisible(true);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
