package Tutorial2.StreamApi.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElementsExample {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,2,3,2,1);
		
		// findFirst() and findAny()-------------------------------------------------------------------------------------------------------
		
		Optional<Integer> element = list.stream().findFirst();
		System.out.println(element);
		if(element.isPresent()) {
			System.out.println("element :: "+element.get());
		}
		else {
			System.out.println("stream is empty");
		}
		System.out.println();
		
		
		Optional<Integer> element2 = list.stream().findAny();
		System.out.println(element2);
		if(element2.isPresent()) {
			System.out.println("element :: "+element2.get());
		}
		else {
			System.out.println("stream is empty");
		}
	}
}
