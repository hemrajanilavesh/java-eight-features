package understanding.functional.interfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html
 *
 * It takes two arguments of type T & U, returns a result of type R
 *
 */
public class BiFunctionExample {

    public static void main(String[] args) {

        // computeIfPresent of Map takes a BiFunction

        String words = "Geeks for Geeks geeks For Geeks GEEKS FOR geeks";

        Map<String, Integer> wordFrequency = new HashMap<>();

        BiFunction<String, Integer, Integer> incrementByOne = (key, oldValue) -> oldValue + 1;

        for (String word : words.split(" ")) {
            wordFrequency.computeIfPresent(word, incrementByOne);   // if found increment old value by 1
            wordFrequency.putIfAbsent(word, 1); // initial word count 1
        }

        wordFrequency.entrySet().forEach(System.out::println);
    }

}
