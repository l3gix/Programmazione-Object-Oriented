package ExtendibleArray;

public class ExtendibleArray
{
    private Object[] data;
    private int dataSize;
    final static int DATA_LENGTH = 100;

    public ExtendibleArray()
    {
        data = new Object[DATA_LENGTH];
        dataSize = 0;
    }

    public Object get(int i)
    {
        if(i < 0 || i >= dataSize) throw new IndexOutOfBoundsException();
        return data[i];
    }

    public int getSize()
    {
        return dataSize;
    }


    public void add(int i,Object x)
    {
       if(dataSize == data.length) resizeArray();
       if(i >= 0 && i <= dataSize)
       {
           arrayCopy(i,i+1,dataSize-i);
           data[i]=x;
           dataSize++;
       }
    }

    /**
     *
     * @param x il valore da cercare
     * @return l'indice nel caso in cui non lo trovo ritorna -1
     */
    public int find(Object x)
    {
        for(int i = 0; i < dataSize; i++)
        {
            if(data[i].equals(x)) return i;
        }

        return -1;
    }

    public void set(int i,Object x)
    {
        if(i < 0 || i >= dataSize) throw new IndexOutOfBoundsException();
        data[i]=x;
    }


    public Object delete(int i)
    {
        if(i < 0 || i >= dataSize) throw new IndexOutOfBoundsException();

        Object ritorno =  data[i]; // mi salvo l'elemento da eliminare cosi lo posso ritornare
        arrayCopy(i+1,i,dataSize-i-1);
        dataSize--;
        data[dataSize]=null;

        return ritorno;
    }



    //Metodi di servizio
    private void arrayCopy(int daStart, int aStart,int num)
    {
        System.arraycopy(data,daStart,data,aStart,num);
    }

    private void resizeArray()
    {
        Object[] newData = new Object[data.length*2];
        System.arraycopy(data,0,newData,0,data.length);
        data = newData;
    }


}
