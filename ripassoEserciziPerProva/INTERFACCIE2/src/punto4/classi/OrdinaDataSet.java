package punto4.classi;

import java.util.ArrayList;

public class OrdinaDataSet <T>
{
    Comparatore<T> cmp;
    ArrayList<T> data;

    public OrdinaDataSet(Comparatore<T> cmp)
    {
        this.cmp = cmp;
        data = new  ArrayList<>();
    }

    public void add(T x)
    {
        data.add(x);
    }

    public ArrayList<T> getData()
    {
        return data;
    }

    public void ordina()
    {
        for(int j = 0; j < data.size() - 1; j++)
            for(int i = 0; i < data.size() - 1 - j; i++)
            {
                if(cmp.comparare(data.get(i),data.get(i+1)) > 0)
                {
                    T t =  data.get(i);
                    data.set(i,data.get(i+1));
                    data.set(i+1,t);
                }
            }
    }
}
