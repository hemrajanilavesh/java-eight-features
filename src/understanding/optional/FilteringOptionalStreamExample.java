package understanding.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringOptionalStreamExample {

    public static void main(String[] args) {
        List<Optional<String>> listOfOptionals = Arrays.asList(Optional.empty(), Optional.of("Foo"), Optional.empty(), Optional.of("Bar"));

        // 1. Using filter and map
        List<String> strings = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println(strings);

        // 2. Using flap map
        strings = listOfOptionals.stream()
                .flatMap(o -> o.map(Stream::of).orElseGet(Stream::empty))
                .collect(Collectors.toList());

        System.out.println(strings);
    }

}
