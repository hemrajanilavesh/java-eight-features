package understanding.functional.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

/**
 * Reference : https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html
 */
public class FunctionExample {

    public static void main(String[] args) {

        Map<String, Integer> nameMap = new HashMap<>();
        Function<String, Integer> func = String::length; // function which takes String argument, applies given lambda expression, and returns Integer

        Integer length = nameMap.computeIfAbsent("John", func); // get from using key "John" or else apply func to compute if not found

        // Examples of Function compose
        // compose allows to combine multiple functional interfaces

        // compose with before. compose() is a default function.
        Function<Integer, String> funcIntegerToString = Objects::toString; // convert integer to string
        Function<String, String> quote = s -> "'" + s + "'"; // surround string with quotes
        Function<Integer, String> composedFunction = quote.compose(funcIntegerToString); // apply before function and then quote function

        System.out.println(composedFunction.apply(5));

        // andThen() to apply function after this function. it is a default function

        Function<Integer, Integer> multiplyByTwo = i -> i * 2;
        Function<Integer, Integer> multiplyByFive = i -> i * 5;
        Function<Integer, Integer> multiplyByTwoThenByFive = multiplyByTwo.andThen(multiplyByFive);

        System.out.println(multiplyByTwoThenByFive.apply(5)); // ((5 * 2) * 5)
        
    }

}
