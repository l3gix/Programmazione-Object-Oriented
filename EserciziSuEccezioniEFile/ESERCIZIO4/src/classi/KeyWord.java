package classi;

public class KeyWord
{
    private String cifrario = "abcdefghijklmnopqrstuvwxyz";
    private String word;

    public KeyWord(String word)
    {
        this.word = rimuoviDuplicati(word);
    }

    public String getWord()
    {
        return word;
    }

    private String rimuoviDuplicati(String s)
    {
        String risultato = "";

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            // Aggiungi solo se non è già presente
            if(risultato.indexOf(c) == -1)
            {
                risultato += c;
            }
        }

        return risultato;
    }


    public char getEncrypt(char c)
    {
        int index = 0;
        int index_f = cifrario.indexOf(c);
        String t = cifrario;

        for(int i = 0; i < word.length(); i++)
        {
            index = cifrario.indexOf(word.charAt(i));
            String replace = cifrario.charAt(index) + "";
            t = t.replace(replace, "");

        }
        //System.out.println("Stringa t = " + t);
        t = word + t;
        //System.out.println("Stringa t = " + t);


        return t.charAt(index_f);
    }
}
