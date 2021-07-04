package understanding.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Streams can be concatenated using Stream.concat()
 *
 * Its disadvantage is that it can only concatenate two streams at a time.
 *
 */
public class MergingStreamsExample {

    public static void main(String[] args) {

        Stream<String> abcd = Stream.of("a", "b", "c", "d");
        Stream<String> efgh = Stream.of("e", "f", "g", "h");
        Stream<String> aToH = Stream.concat(abcd, efgh);

        System.out.println(aToH.collect(Collectors.joining(", ", "[", "]")));


    }
}
