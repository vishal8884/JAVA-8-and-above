package Tutorial2.functionalInterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{     //   input type -> one Object       return type -> none

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}

public class ConsumerDemo {

	public static void main(String[] args) {
		
//		Consumer<String> consumer = new ConsumerImpl();           //Traditional way
//		consumer.accept("name");
		
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("name2");
	}
}
