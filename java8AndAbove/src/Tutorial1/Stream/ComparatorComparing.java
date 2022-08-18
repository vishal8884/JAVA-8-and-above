package Tutorial1.Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class ComparatorComparing {

	public static void main(String[] args) {

		StudentObject a = new StudentObject("vishal",80,176);
		StudentObject b = new StudentObject("gaara",98,169);
		StudentObject c = new StudentObject("ching",30,196);
		
		
		Optional<StudentObject> o=Stream.of(a,b,c)
				                  .min(Comparator.comparing(s -> s.getHeight()));
		
		System.out.println(o.get());
		
		Optional<StudentObject> o2 = Stream.of(a,b,c)
				                   .max(Comparator.comparing(s -> s.getHeight()));
		
		System.out.println(o2);
	}

}
