package Tutorial2.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEachExample {

	public static void main(String[] args) {

		Map<Integer, Person> map = new HashMap<>();
		
		map.put(1, new Person("vishal", 24));
		map.put(2, new Person("vishal2", 25));
		map.put(3, new Person("vishal3", 24));
		map.put(4, new Person("vishal4", 25));
		map.put(5, new Person("vishal5", 25));
		
		
		//prior java 8-------------------------------------------------------------------------------
		
		for(Entry<Integer,Person> entry: map.entrySet()) {
			System.out.println("key :: "+entry.getKey()+"    value :: "+entry.getValue());
		}
		
		System.out.println();
		//after java 8
		
		map.forEach((key,value) -> System.out.println("key :: "+key+"      value :: "+value));
	}

}
