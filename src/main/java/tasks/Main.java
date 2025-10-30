package tasks;

import tasks.Collection.ClassFilter;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] rawData = {"Oleg", "hello", "world"};

        String[] result = ClassFilter.filter(rawData, String::toUpperCase);

        System.out.println(Arrays.toString(result));

    };

    public static <T> Map<T, Long> countElements(T[] array) {
        return Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()
                ));
    }
}