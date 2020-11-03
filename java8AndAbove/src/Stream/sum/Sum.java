package Stream.sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Sum {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 1,2,3,4,5,6,7,8,9);
		
		
		Optional<Integer> sum=list.stream()
		.reduce((a,b) -> a+b);
		
		System.out.println(sum.get());
		
		Integer x=9;
		int y=x;
		
		////////////////////////
		
		int sum1 = list.stream()
				   .mapToInt(a -> a)
				   .sum();
		
		System.out.println("sum1 "+sum1);
	}

}
