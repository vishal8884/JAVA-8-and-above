package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

		Function<String, Integer> strlen = (s) -> s.length();
		
		Function<Integer,Integer> square =(i) -> i*i;
		
		//Function<String,Integer> bic =(s) -> s.length();
		//BiConsumer<String,Integer> bic2 =(s,i) -> System.out.println(s+" i: "+i);
		
		System.out.println(strlen.apply("vishal"));
		
		System.out.println(strlen.andThen(square).apply("vishal"));
	}

}
