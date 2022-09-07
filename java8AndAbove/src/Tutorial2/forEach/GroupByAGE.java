package Tutorial2.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByAGE {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("vishal", 24));
		list.add(new Person("vishal2", 25));
		list.add(new Person("vishal3", 26));
		list.add(new Person("vishal4", 27));
		list.add(new Person("vishal5", 24));
		list.add(new Person("vishal6", 24));
		list.add(new Person("vishal7", 24));
		list.add(new Person("vishal8", 25));
		
		Map<Integer, List<Person>> groupByAgeMap = groupByAge(list);
		
		groupByAgeMap.forEach((k,v) -> System.out.println("key :: "+k+"     val :: "+v));
	}
	
	
	
	public static Map<Integer, List<Person>> groupByAge(List<Person> personList) {
		Map<Integer, List<Person>> map = new HashMap<>();
		
		for(Person p : personList) {
			if(map.containsKey(p.getAge())) {
				List<Person> pList = map.get(p.getAge());
				pList.add(p);
				map.put(p.getAge(), pList);
			}
			else {
				List<Person> pList = new ArrayList<>();
				pList.add(p);
				map.put(p.getAge(),pList);
			}
		}
		
		return map;
	}

}
