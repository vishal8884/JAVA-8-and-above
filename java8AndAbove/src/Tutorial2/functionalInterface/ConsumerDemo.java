package Tutorial2.functionalInterface;

import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String>{     //Consumer accepts input is void method          //Traditional approach

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
