//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SplitTest {
    public static void main(String[] args)
    {
        String sentence = "Mary had a little lamb";
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++)System.out.println(words[i]);
    }
}