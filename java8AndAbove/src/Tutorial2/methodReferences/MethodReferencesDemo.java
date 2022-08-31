package Tutorial2.methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
		System.out.println();System.out.println();
		
		
		
		//1) BIFUNCTION functional interface//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		BiFunction<Integer, Integer, Integer> biFunctionLambda = (a,b) -> MethodReferencesDemo.addition(a, b);
		System.out.println("bifunctionLambda sum :: "+biFunctionLambda.apply(3, 4));
		
		//se method reference
		BiFunction<Integer, Integer, Integer> biFunctionLambda2 = MethodReferencesDemo::addition;
		System.out.println("bifunctionLambda sum :: "+biFunctionLambda2.apply(5, 4));
		System.out.println();System.out.println();
		
		
		
		
		
		// 2) Method reference to an instance method of an object////////////////////////////////////////////////////////////////////////////////////////////////
		MethodReferencesDemo methodReferencesDemo = new MethodReferencesDemo();
		
		//normal lambda
		Printable printable = (msg) -> methodReferencesDemo.display(msg);
		printable.print("hello world");
		
		//method reference
		Printable printable2 = methodReferencesDemo::display;
		printable2.print("hello java");
		System.out.println();System.out.println();
		
		
		
		
		
		// 3) reference to an instance object of arbitary object///////////////////////////////////////////////////////////////////////////////////////////////////
		
		Function<String, String> stringFunction = (ip) -> ip.toLowerCase();
		System.out.println("stringFunction :: "+stringFunction.apply("VISAL"));
		
		Function<String, String> stringFunction2 = String::toLowerCase;
		System.out.println("stringFunction :: "+stringFunction2.apply("VISALAAA"));
		
		// eg2 
		String[] strArray = {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(strArray, (s1,s2) -> s1.compareToIgnoreCase(s2));
		System.out.println("strArray :: "+Arrays.toString(strArray));
		
		String[] strArray2 = {"A","E","I","O","U","a","e","i","o","u"};
		Arrays.sort(strArray2, String::compareToIgnoreCase);
		System.out.println("strArray2 :: "+Arrays.toString(strArray2));
		System.out.println();System.out.println();
		
		
		
		
		
		// 4) reference to the constructor///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		List<String> fruits = new ArrayList<>();
		fruits.add("bananna");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("watermelon");
		
		Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruits);
		System.out.println("setFunction :: "+setFunction.apply(fruits));
		
		
		//using method reference
		Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;                      //// for new method reference
		System.out.println("setFunctionMethodRef :: "+setFunctionMethodRef.apply(fruits));
	}

}
