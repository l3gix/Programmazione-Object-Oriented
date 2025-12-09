package punto1.tester;

import punto1.classi.FindMaxAndMIn;

import java.util.ArrayList;
import java.util.Comparator;

//["Roma", "Milano", "Napoli", "Torino", "Palermo", "Genova", "Bologna", "Firenze"]
public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Roma");
        lista.add("Milano");
        lista.add("Napoli");
        lista.add("Torino");
        lista.add("Palermo");

        String max = FindMaxAndMIn.findMax(lista,(obj1,obj2)->{return obj1.compareTo(obj2);});
        System.out.println(max);
        String min = FindMaxAndMIn.findMin(lista,(obj1,obj2)->{return obj1.compareTo(obj2);});
        System.out.println(min);

        Comparator<String> cmp = (obj1,obj2)->{
            if(obj1.compareTo(obj2)==0) return obj1.length()-obj2.length();
            else  return obj1.compareTo(obj2);
        };


    }

}
