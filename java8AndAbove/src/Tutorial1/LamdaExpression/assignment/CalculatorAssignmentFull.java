package Tutorial1.LamdaExpression.assignment;

import java.util.HashMap;
import java.util.Map;

public class CalculatorAssignmentFull {
	
	
	public static final Map<String, MathOperation> map = new HashMap<String, MathOperation>();
	
	static
	{
		map.put("+", (a,b) -> a+b);
		map.put("-", (a,b) -> a-b);
		map.put("*", (a,b) -> a*b);
		map.put("/", (a,b) -> a/b);
	}
	
	public void addOperation(String key, MathOperation mo)
	{
		map.put(key, mo);
	}
	
	public static int calculate(String expression)
	{
		String[] expr = expression.split(" ");
		int onscreenno = Integer.parseInt(expr[0]);
		
		for(int i=1; i<expr.length ; i=i+2)
		{
			MathOperation op =map.get(expr[i]);
			int enteredno = Integer.parseInt(expr[i+1]);
			onscreenno = calculate(onscreenno,op,enteredno);
		}
		
		return onscreenno;
	}
	
	

	public static int calculate(int onscreennumber, MathOperation mo, int enteredno) {

		return mo.operate(onscreennumber, enteredno);
	}

}
