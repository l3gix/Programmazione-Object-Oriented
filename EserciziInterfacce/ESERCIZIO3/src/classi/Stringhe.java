package classi;

public class Stringhe implements  Measurable
{
    private String s;
    public Stringhe()
    {
    }
    public Stringhe(String s)
    {
        this.s = s;
    }

    public String getStringhe()
    {
        return s;
    }

    public void setStringhe(String s)
    {
        this.s = s;
    }

    public String toString()
    {
        return s;
    }

    @Override
    public String getMeasurable() {
        return s;
    }

    @Override
    public int comparable(Object other) {
        Stringhe str =  (Stringhe) other;
        return s.compareTo(str.s);
    }
}
