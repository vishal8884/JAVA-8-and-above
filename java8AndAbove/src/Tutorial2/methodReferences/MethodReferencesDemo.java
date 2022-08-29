package Tutorial2.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodReferencesDemo {
	
	public void display(String msg) {
		System.out.println(msg.toUpperCase());
	}
	
	public static int addition(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {

		Function<Integer, Double> function = (ip) -> Math.sqrt(ip); 
		System.out.println(function.apply(9));
		
		//using method reference
		Function<Integer, Double> function2  = Math::sqrt;
		System.out.println(function2.apply(16));
		
		
		//1) BIFUNCTION functional interface/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addition(a, b);
		System.out.println("bifunctionLambda sum :: "+biFunctionLambda.apply(3, 4));
		
		//se method reference
		BiFunction<Integer, Integer, Integer> biFunctionLambda2 = MethodReferencesDemo::addition;
		System.out.println("bifunctionLambda sum :: "+biFunctionLambda2.apply(5, 4));
		
		
		// 2) Method reference to an instance method of an object////////////////////////////////////////////////////////////////////////////////////
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
		
		//normal lambda
		Printable printable = (msg) -> methodReferencesDemo.display(msg);
		printable.print("hello world");
		
		//method reference
		Printable printable2 = methodReferencesDemo::display;
		printable2.print("hello java");
		
		
		
		// 3) reference to an instance object of arbitary object///////////////////////////////////////////////////////////////////////////////////////
		
		Function<String, String> stringFunction = (ip) -> ip.toLowerCase();
		System.out.println("stringFunction :: "+stringFunction.apply("VISAL"));
		
		Function<String, String> stringFunction2 = String::toLowerCase;
		System.out.println("stringFunction :: "+stringFunction2.apply("VISALAAA"));
		
		
	}

}
