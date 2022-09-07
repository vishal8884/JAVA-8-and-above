package Tutorial2.functionalInterface.Bi;

import java.util.function.BiFunction;

class BiFunctionExample implements BiFunction<Integer, Integer, String>{         //Traditional way

	@Override
	public String apply(Integer t, Integer u) {
		return t.toString()+u.toString();
	}
	
}


public class BiFunctionDemo {
	
	public static void main(String[] args) {
        
		BiFunctionExample be = new BiFunctionExample();
		String biFunctionJava7 = be.apply(2, 3);
		System.out.println("biFunctionJava7 :: "+biFunctionJava7);
		
		System.out.println();
		
		//Java 8 way -----------------------------------------No need of above code for this----------------------------------------------------------------------
		
		BiFunction<Integer, Integer, String> biFunction = (a,b) -> a.toString()+b.toString(); 
		String biFunctionRes = biFunction.apply(3, 8);
		System.out.println("binFunctionRes :: "+biFunctionRes);
		
	}

}
