package understanding.collections.api.polymorphic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FrequencyAndDisjointExample {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 1");
        list.add("element 3");
        
        System.out.println("Frequency of element 1 -> " + Collections.frequency(list, "element 1"));
        
        List<String> list2 = new LinkedList<>();
        list2.add("element 2");
        list2.add("element 1");
        list2.add("element 1");
        list2.add("element 3");
        
        System.out.println("\nAre the two lists disjoint ? -> " + Collections.disjoint(list, list2));
        
        List<String> list3 = new LinkedList<>();
        list3.add("element 4");
        list3.add("element 5");
        list3.add("element 7");
        list3.add("element 6");
        
        
        System.out.println("\nAre the two lists disjoint ? -> " + Collections.disjoint(list, list3));
        
        System.out.println("\nFind min of list -> " + Collections.min(list2));
        
        System.out.println("\nFind max of list -> " + Collections.max(list3));

	}

}
