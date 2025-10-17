package it.unisa.lp2.money;

public class Coin
{
    private String name;
    private double value;

    /**
     * come precondzioni valure > 0
     * @param name il nome della moneta
     * @param value il valore della moneta
     */
    public Coin(String name, double value)
    {
        assert value > 0;
        assert !(name.isEmpty());
        this.name = name;
        this.value = value;
    }

    /**
     *
     * @return il name
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @return il valore
     */
    public double getValue()
    {
        return value;
    }


}
