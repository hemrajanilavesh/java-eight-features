package understanding.collections.api.lists;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusingAStream {

	public static void main(String[] args) {
		String[] letters = new String[] {"a", "b", "c", "d", "e", "f"};
		
		Supplier<Stream<String>> supplierStream = () ->  Arrays.stream(letters);
		
		// forEach is a terminating stream operation
		supplierStream.get().forEach(System.out::println);
		
		// streams can be reused with supplier
		Long count = supplierStream.get().filter(letter -> !"e".equals(letter)).count();
		
		System.out.println(count);
		

	}

}
