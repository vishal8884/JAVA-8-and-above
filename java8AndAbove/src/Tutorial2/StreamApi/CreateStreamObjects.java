package Tutorial2.StreamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {

		//create a stream
		Stream<String> stream = Stream.of("a","b","c");
		stream.forEach(s -> System.out.println(s));
		
		
		//create a stream from sources
		Collection<String> collection = Arrays.asList("java","spring","j2ee","hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		
		// create stream fom source
		List<String> list = Arrays.asList("java2","spring2","j2ee2","hibernate2");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		
		//create stream from hashset
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		
		//create Stream from array
		String[] arr = {"a1","a2","a3"};
		Stream<String> stream5 = Arrays.stream(arr);
		stream5.forEach((s) -> System.out.println(s));
	}

}
