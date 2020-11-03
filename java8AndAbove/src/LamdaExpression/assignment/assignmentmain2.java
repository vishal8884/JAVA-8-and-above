package LamdaExpression.assignment;

import java.util.*;

public class assignmentmain2 {

	public static void main(String[] args) {
		System.out.println("started");
        
		
		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		MathOperation mul = (a,b) -> a*b;
		MathOperation div = (a,b) -> a/b;
		
		int onscreen=0;
		onscreen=calculate(5,add,2);
		onscreen=calculate(onscreen,sub,3);
		onscreen=calculate(onscreen,mul,7);
		onscreen=calculate(onscreen,add,2);
		onscreen=calculate(onscreen,div,3);
		System.out.println(onscreen);
	}
	
	
	public static int calculate(int onscreen , MathOperation mo , int entered)
	{
		
		return mo.operate(onscreen, entered);
	}

}
