package Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {

		List<Integer> a =new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		
		List<Integer> b =new ArrayList<Integer>();
		b.add(4);
		b.add(5);
		b.add(6);
		
		List<Integer> c =new ArrayList<Integer>();
		c.add(7);
		c.add(8);
		c.add(9);
		
		List<List<Integer>> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		list.stream()
		.flatMap(i -> i.stream())
		.forEach(i -> System.out.println(i));
		
	}

}
