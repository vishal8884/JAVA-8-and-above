package Tutorial2.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {   //   input type -> two Objects       return type -> none

	public static void main(String[] args) {
		
		BiConsumer<Integer,String> biconsumer = (i,s) -> System.out.println("id :: "+i+"    name :: "+s);
		biconsumer.accept(1,"vishal");

	}
}
