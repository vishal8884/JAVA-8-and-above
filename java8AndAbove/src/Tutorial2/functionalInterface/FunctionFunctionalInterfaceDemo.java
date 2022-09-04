package Tutorial2.functionalInterface;

import java.util.function.Function;

class FunctionImpl implements Function<String, Integer>{             //   input type -> one Object       return type -> one object

	@Override
	public Integer apply(String t) {
		return t.length();
	}
	
}

public class FunctionFunctionalInterfaceDemo {      

	public static void main(String[] args) {
		
//		Function<String, Integer> function = new FunctionImpl();           //Traditional approach
//		System.out.println("len :: "+function.apply("name"));
		
		Function<String, Integer> function = (s) -> {               //direct impl here
			return s.length();
		};
		
		System.out.println("len :: "+function.apply("name2"));
		
	}
}
