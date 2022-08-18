package Tutorial1.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NotReusable {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("hippopotumus");
		list.add("donkey");
		list.add("ho");
		list.add("tobi");
		list.add("guy");
		
		
		Stream<String> stream = list.stream()
				                 .filter(l -> l.length()>3);
		
		stream.forEach(s -> System.out.println(s));
		stream.forEach(s -> System.out.println(s)); //throws error
	}

}
