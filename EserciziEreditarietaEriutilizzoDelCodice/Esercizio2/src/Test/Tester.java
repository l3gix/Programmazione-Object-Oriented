package Test;

import Esercizio.*;
import jdk.jshell.spi.ExecutionControl;

public class Tester
{
    public static void main(String[] args)
    {
        Persona persona = new Persona("Andrea",10,"xxx");
        System.out.println(persona);
        Persona persona2 = new Persona("Andrea",10,"xxx");
        System.out.println(persona2);
        if(persona.equals(persona2)) System.out.println("Sono uguali");

        Persona persona3 = persona.clone();
        if(persona3.equals(persona2)) System.out.println("Sono uguali");

        persona = new Impiegato("Andrea",10,"xxx" , "Spazzino");
        System.out.println(persona);
        if(persona.equals(persona2)) System.out.println("Sono uguali");
        else System.out.println("non sono uguali");

        Impiegato impiegato2 = new Impiegato("Andrea",10,"xxx" , "Spazzino");

        if(persona.equals(impiegato2)) System.out.println("Sono uguali gli impiegato");

        persona = new Manager("Andrea",10,"xxx" , "Spazzino","Logistica");
        System.out.println(persona);


    }
}
