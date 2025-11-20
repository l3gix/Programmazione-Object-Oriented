package classi;

import java.util.ArrayList;

public class ArrayTester
{
    public static <T> T findElement(T[] array, T element)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(element))return array[i];

        }
        return null;
    }

    public static <?> ?findElement(ArrayList<?> l, ?l )
    {

    }

    public static void main(String[] args)
    {
        Integer [] a = new Integer[10];
        for(int i = 0; i < a.length; i++)a[i] = i;

        int find = ArrayTester.findElement(a,3);
        System.out.println(find);
    }
}
