package understanding.streams;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * The API has many terminal operations which aggregate a stream to a type or to a primitive: count(), max(), min(), and sum().
 * However, these operations work according to the predefined implementation.
 * So what if a developer needs to customize a Stream's reduction mechanism?
 * There are two methods which allow us to do this, the reduce() and the collect() methods.
 *
 * identity – the initial value for an accumulator, or a default value if a stream is empty and there is nothing to accumulate
 *
 * accumulator – a function which specifies the logic of the aggregation of elements.
 * As the accumulator creates a new value for every step of reducing, the quantity of new values equals the stream's size and only the last value is useful.
 * This is not very good for the performance.
 *
 * combiner – a function which aggregates the results of the accumulator. We only call combiner in a parallel mode to reduce the results of accumulators from different threads.
 *
 *
 */

public class StreamReduceExample {

    public static void main(String[] args) {

        // calling reduce just with accumulator
        // (a, b) -> a + b is accumulator
        OptionalInt accumulatorReducedInt = IntStream.range(1, 4).reduce((a, b) -> a + b);
        accumulatorReducedInt.ifPresent(System.out::println);

        // calling reduce with identity and accumulator
        // identity - the initial value for an accumulator, or a default value if a stream is empty and there is nothing to accumulate
        int identityAccumulatorReducedInt = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        // (((10 + 1) + 2) + 3)
        System.out.println(identityAccumulatorReducedInt);

        //  reduce with identity, accumulator and combiner
        // can only be called in parallel mode

        int reduceByCombiner = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> a + b);
        // applies accumulator function in parallel to all elements (10 + 1, 10 + 2, 10 + 3) = 11, 12, 13
        // then applies combiner function to reduce it to one result  (11 + 12 + 13) = 36
        System.out.println(reduceByCombiner);

    }


}
