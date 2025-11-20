package quesito2;

public class KeyTester
{

    public static <T extends Comparable> WithKey<T> binarySearch(WithKey<T>[]array, T value)
    {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1; // avoids overflow
            T midVal = array[mid].getKey();  // assuming WithKey<T> has getKey()

            int cmp = midVal.compareTo(value);
            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return array[mid]; // found
            }
        }
        return null; // not found
    }


    public static class StringWithKey<T extends Comparable> implements WithKey<T>,Comparable<WithKey<T>>
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


        @Override
        public int compareTo(WithKey<T> other) {
            return  key.compareTo(other.getKey());
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
                ((StringWithKey<Integer>)(KeyTester.binarySearch(array,3))).getValue()
        );

    }
}
