package MioArrayList;

import ExtendibleArray.ExtendibleArray;

public class MioArrayList
{
    private ExtendibleArray array;

    public MioArrayList()
    {
        array = new ExtendibleArray();

    }

    public void add(Object o)
    {
        array.add(array.getSize(), o);

    }


    public void add(int i, Object o)
    {
        array.add(i,o);
    }

    public void set(int i , Object o)
    {
        array.set(i,o);
    }


    public void remove(int i)
    {
        array.delete(i);
    }

    public Object get(int i)
    {
        return array.get(i);
    }

    public int size()
    {
        return array.getSize();
    }


}
