package Stream;

import java.util.ArrayList;
import java.util.List;


public class NonStremSUM {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
        
		list.stream().peek(i -> System.out.println("before peek :"+i))
		.filter(i -> i>5)
		.filter(i -> i%2==0)
		.peek(i -> System.out.println("filtered_i :"+i))
		//.sorted()
		.limit(3)
		.map(i -> (i*i)+2)
		.forEach(i -> System.out.println("i*i: "+i));
	}

}
