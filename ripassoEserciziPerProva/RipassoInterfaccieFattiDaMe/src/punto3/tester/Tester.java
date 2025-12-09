package punto3.tester;

import punto3.classi.Book;
import punto3.classi.OderBook;

import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Book> lista = new ArrayList<Book>();
        lista.add(new Book("a","a",30,30));
        lista.add(new Book("b","b",10,10));
        lista.add(new Book("c","c",20,20));


        OderBook.orderBook(lista,(obj1,obj2) ->
                {
                    return Integer.compare(obj1.getPages(),obj2.getPages());
                }
                );

        System.out.println(lista);
    }
}
