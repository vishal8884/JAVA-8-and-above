package Tutorial2.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {               //input -> one object       output --> boolean

	public static void main(String[] args) {

		Predicate<String> predicate = (s) -> s.length()==3;
		Predicate<String> predicate2 = (s) -> !s.isBlank();
		
		System.out.println(predicate.and(predicate2).test("abc"));
		
	}

}
