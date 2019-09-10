package ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create (int length , T item ){
        Object[] obj = new Object[length];

        for (int i = 0; i < length; i++) {
            obj [i] = item;
        }
        return (T[])obj;
    }
    public static <T> T[] create (Class<T> tClass , int length , T item){

        T[] arr = (T[])Array.newInstance(tClass,length);

        for (int i = 0; i < length; i++) {
            arr[i] = item;
        }
        return arr;
    }
}
