package understanding.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * Streams are meant for data processing and not index based access of elements.
 * However, it can be done. https://www.baeldung.com/java-stream-indices
 *
 */
public class StreamIndexBasedFiltering {

    public static void main(String[] args) {
        String[] names  = {"Afrim", "Bashkim", "Besim", "Lulzim", "Durim", "Shpetim"};
        System.out.println(getEvenIndexedNames(names));
        System.out.println(getOddIndexedNames(names));
        
    }

    static List<String> getEvenIndexedNames(String[] names) {
        List<String> evenIndexedNames = IntStream.range(1, names.length)  // its a design decision to include 0 or not
                                                .filter(i -> i % 2 == 0)
                                                .mapToObj(i -> names[i])
                                                .collect(Collectors.toList());
        return evenIndexedNames;
    }



    static List<String> getOddIndexedNames(String[] names) {
        List<String> oddIndexedNames = IntStream.range(1, names.length)  // its a design decision to include 0 or not
                                                .filter(i -> i % 2 != 0)
                                                .mapToObj(i -> names[i])
                                                .collect(Collectors.toList());
        return oddIndexedNames;
    }

}
