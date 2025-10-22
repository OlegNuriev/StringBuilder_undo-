package tasks;

import tasks.Collection.ClassFilter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] rawData = {"oleg", "hello", "world"};

        String[] result = ClassFilter.filter(rawData, String::toUpperCase);

        System.out.println(Arrays.toString(result));

    }
}