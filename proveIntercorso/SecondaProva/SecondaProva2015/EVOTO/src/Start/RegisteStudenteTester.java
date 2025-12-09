package Start;

import classi.ListaStudenti;
import grafica.RegisterStudente;

import javax.swing.*;

public class RegisteStudenteTester
{
    public static void main(String[] args)
    {
        ListaStudenti lista = new ListaStudenti();

        RegisterStudente tester = new RegisterStudente(lista);

        System.out.println(lista.toString());

        tester.setVisible(true);
        tester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
