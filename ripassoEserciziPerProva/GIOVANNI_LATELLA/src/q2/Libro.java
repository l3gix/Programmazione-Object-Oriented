package q2;


import java.io.Serializable;

public class Libro  implements Serializable
{
   public Libro(Autore a, String t, int an)
   {
      autore = a;
      titolo = t;
      anno = an;
   }

   
   public Autore getAutore()
   {
      return autore;
   }

   public String getTitolo()
   {
      return titolo;
   }   

   
   public int getAnno()
   {
	   return anno;	
   }


   private int anno;
   private Autore autore;
   private String titolo;
}
