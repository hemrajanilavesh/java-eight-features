package understanding.collectors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionToLinkedListUsingCollectorsExample {

    public static void main(String[] args) {

        List<String> listWithDuplicates = Arrays.asList("a", "bb", "c", "a", "d", "bb");

        Predicate<String> mustBeSmallCaseA = s -> s != null && s.equalsIgnoreCase("a");

        // collects list of "a" int a linked list
        LinkedList<String> linkedList = listWithDuplicates.stream()
                                                          .filter(mustBeSmallCaseA)
                                                          .collect(Collectors.toCollection(LinkedList::new));

        linkedList.forEach(System.out::println);

    }

}
