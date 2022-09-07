package Tutorial2.StreamApi.example;

import java.util.Comparator;
import java.util.stream.Stream;

public class Count_Min_max_Methods {

	public static void main(String[] args) {

		//count(), min() and max() methods
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println("stream count :: "+stream.count()); System.out.println();
		
		
		//Integer minVal = stream.min(Comparator.comparing((i) -> Integer.valueOf(i))).get();
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9);
		Integer minVal = stream2.min((a,b) -> a-b).get();
		System.out.println("min val :: "+minVal);
		
		Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6,7,8,9);
		Integer maxVal= stream3.max((a,b) -> a-b).get();
		System.out.println("maxVak :: "+maxVal);
  	}

}
