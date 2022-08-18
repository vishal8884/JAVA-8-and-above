package Tutorial1.FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Biconsumer {

	public static void main(String[] args) {

		Consumer<String> c1 =(s) -> System.out.println("first :"+s);
		Consumer<String> c2 =(s) -> System.out.println("second :"+s);
		
		
		
		Consumer<String> combined = c1.andThen(c2);
		
		combined.accept("bishal");
		
        BiConsumer<String,Integer> bic =(s,i) -> System.out.println(s+" i: "+i);
		 
		
		bic.accept("vishal", 22);
		
		
		Map<String, Consumer<String>> map = new HashMap<String, Consumer<String>>();
		
		map.put("c1", c1);
		map.put("c2", c2);
		map.put("combined", combined);
		
		map.forEach((k,v) -> System.out.println("key is :"+k));
	}

}
