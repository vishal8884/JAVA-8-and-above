package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collector {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("hippopotumus");
		list.add("donkey");
		list.add("ho");
		list.add("tobi");
		list.add("guy");
		
		
		List<String> newlist =list.stream()
		.filter(s -> s.length()>3)
		.collect(Collectors.toList());
		
		System.out.println(newlist +" newlist");
		
		
		///////////////////////////////////
		
		Set<String> newset =list.stream()  //no dublicates in set
				.filter(s -> s.length()>3)
				.collect(Collectors.toSet());
				
				System.out.println(newset+" newset");
				
				
		////////////joined string/////////////////
				
		String joined = list.stream()
				        .filter(s -> s.length()>3)
				        .collect(Collectors.joining("; "));
		
		System.out.println(joined+" joined");
		
		/////////////grouping by///////////////////
		
		Map<Integer ,List<String>> map = list.stream()
				                         .collect(Collectors.groupingBy(s -> s.length()));
		
		System.out.println(map +" :map");
		////////////////////////////////////
		Map<Character ,List<String>> map2 = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

System.out.println(map2+" :map2");
	}

}
