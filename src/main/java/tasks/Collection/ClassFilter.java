package tasks.Collection;

import java.lang.reflect.Array;

public class ClassFilter {

    public static <T> T[] filter(T[] inputArray, Filter<T> filter) {

        int length = inputArray.length;

        @SuppressWarnings("unchecked")
        T[] resultArray = (T[]) Array.newInstance(inputArray.getClass().getComponentType(), length);

        for (int i = 0; i < length; i++) {
            resultArray[i] = filter.apply(inputArray[i]);
        }
        return resultArray;
    }
}
