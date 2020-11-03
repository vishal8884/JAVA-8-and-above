package playaround;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorPlay {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("hippopotumus");
		list.add("donkey");
		list.add("ho");
		list.add("tobi");
		list.add("guy");
		
		
		Set<String> a1=list.stream()
		    .filter(s -> s.charAt(0)=='d')
		    .collect(Collectors.toSet());
		
		System.out.println(a1);
		
		Map<Character,List<String>> map = list.stream()
				                          .collect(Collectors.groupingBy(c -> c.charAt(0)));
		
		System.out.println(map);
		
	}

}
