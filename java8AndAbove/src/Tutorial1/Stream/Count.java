package Tutorial1.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Count {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("hippopotumus");
		list.add("donkey");
		
		
		
		System.out.println(list.stream()
				.filter(e -> e.length()>4)
				.count()
				);
		
		////////////////////////findfirst and get
		
		System.out.println(
				list.stream()
				.filter(e -> e.length()>4)
				.findFirst().get()
				);
		
		////////////////////min and max////////////////////
		
		System.out.println(
				list.stream()
				.max(Comparator.naturalOrder())
				);
		
		///////////////anymatch and non match////////////
		
		System.out.println(
				list.stream()
				.anyMatch(e -> e.contains("a"))
				);
		
	}

}
