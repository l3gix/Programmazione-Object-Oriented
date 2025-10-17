public class CodiceBarre
{
    private final String[] matrice = { // matrice per codificare
            "11000",//0
            "00011",//1
            "00101",//2
            "00110",//3
            "01001",//4
            "01010",//5
            "01100",//6
            "10001",//7
            "10010",//8
            "10100"//9
    };

    public CodiceBarre()
    {

    }

    public  String[] getMatrice()
    {
        return matrice;
    }

    public void printMatrice()
    {
        for(String x : matrice) System.out.println(x);
    }

    public String toCodiceBarre(int valore)
    {
        String r = "| ";
        int totale = 0,controlBit = 0;
        String temp = Integer.toString(valore);

        for(int i = 0; i < temp.length(); i++)
        {
            int t = Integer.parseInt(temp.substring(i, i+1));

            r = r + matrice[t] + " ";
            totale = totale + Integer.parseInt(temp.substring(i, i+1)); // aggiungiamo il totale cosi poi verifichiamo se seve il control bit
        }

        controlBit = 10 - (totale % 10);
        if(controlBit != 10) r = r + matrice[controlBit];
        r = r.replaceAll("1","|");
        r = r.replaceAll("0",":");
        return(r + " |");
    }

    public int fromCodiceBarre(String r)
    {
        String totale = "";
        r = r.substring(2,r.length()-2);
        r = r.replaceAll("\\|","1");
        r = r.replaceAll(":","0");
        String []temp = r.split(" ");
        for(String x : temp)
        {
            for(int i = 0; i < matrice.length; i++)
            {
                if(x.equals(matrice[i]))
                {
                    totale = totale + "" + i;
                    break;
                }
            }
        }
        return Integer.parseInt(totale);
    }
}
