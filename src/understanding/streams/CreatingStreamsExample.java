package understanding.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Different ways of generating a stream.
 */

public class CreatingStreamsExample {

    public static void main(String[] args) {

        // 1. Create an empty stream
        Stream<String> emptyStream = Stream.empty();

        //2. Create a stream from a collection
        Collection<String> listOfChars = Arrays.asList("a", "b", "c");
        Stream<String> charStreamFromCollection = listOfChars.stream();

        // 3. Creating a stream from elements
        Stream<String> charStreamFromElements = Stream.of("a", "b", "c");

        // 4. Creating a stream from arrays
        String[] chars = new String[] {"a", "b", "c"};
        Stream<String> charStreamFromArray = Arrays.stream(chars);

        // 5. Stream Builder
        //  When builder is used, the desired type should be additionally specified in the right part of the statement,
        //  otherwise the build() method will create an instance of the Stream<Object>:

        Stream.Builder<String> charStreamFromBuilder = Stream.<String>builder().add("a").add("b").add("c");

        // 6. Create stream by Stream.generate()
        // The generate() method accepts a Supplier<T> for element generation. As the resulting stream is infinite,
        // the developer should specify the desired size, or the generate() method will work until it reaches the memory limit.

        Stream<String> streamFromGenerate = Stream.generate(() -> "element").limit(10);
        // code above creates a sequence of 10 - "element" strings

        // 7. Create stream by Stream.iterate()
        // it takes an initial seed and a lambda expression containing a unary operator

        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 1).limit(10);
        // above stream contains sequence of 10 elements starting from 1 and incremented by 1 with each iteration.
        // its important to specify limit since iterate generates infinite stream


        // 8. Stream of Primitives i.e. IntStream, LongStream, DoubleStream.
        IntStream intStreamEndExcluded = IntStream.range(1, 5);// range(int startInclusive, int endExclusive) sequence of 1,2,3,4

        IntStream intStreamEndIncluded = IntStream.rangeClosed(1, 5);// range(int startInclusive, int endExclusive) sequence of 1,2,3,4, 5

    }

}
