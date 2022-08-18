package Tutorial1.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		List<String> list =new ArrayList<String>();
		list.add("naruto");
		list.add("lee");
		
		Consumer<String> c1 =(s) -> System.out.println(s);
		
		
		list.forEach(c1);
		
 //same as above		
		list.forEach(s -> System.out.println(s.toUpperCase()));
	}

}
