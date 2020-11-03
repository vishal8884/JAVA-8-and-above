package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {

		List<String> list =new ArrayList<String>();
		list.add("naruto");
		list.add("lee");
		
		Consumer<String> c1 =(s) -> System.out.println("first :"+s);
		Consumer<String> c2 =(s) -> System.out.println("second :"+s);
		
		Consumer<String> combined = c1.andThen(c2);
		
		list.forEach(combined);
		
	}

}
