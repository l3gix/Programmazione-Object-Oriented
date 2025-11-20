package quesito1;

public class KeyTester
{

    public static <T> WithKey<T> findElementByKey(WithKey<T>[]array, T value)
    {
        for(WithKey<T> element : array)
        {
            if(element.getKey().equals(value))
                return element;
        }

        return null;
    }


    public static class StringWithKey<T> implements WithKey<T>
    {
        private T key;
        private String value;

        public StringWithKey(String value,T key)
        {
            this.value=value;
            this.key=key;
        }

        public String getValue()
        {
            return value;
        }

        @Override
        public T getKey() {
            return key;
        }
    }


    public static void main(String[] args)
    {
        WithKey<Integer>[] array = (StringWithKey<Integer>[]) new StringWithKey[5];

        for(int i = 0; i < array.length; i++)
        {
            array[i] = new StringWithKey<Integer>("pippo " + i , i);
        }

        System.out.println(
                ((StringWithKey<Integer>)(KeyTester.findElementByKey(array,3))).getValue()
        );

    }
}
