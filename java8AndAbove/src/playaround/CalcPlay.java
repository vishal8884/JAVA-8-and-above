package playaround;

import java.util.HashMap;
import java.util.Map;

public class CalcPlay {
	
	public static final Map<String, MathOperation> map = new HashMap<String, MathOperation>();
	
	static
	{
		map.put("+", (a,b) -> a+b);
		map.put("-", (a,b) -> a-b);
		map.put("*", (a,b) -> a*b);
		map.put("/", (a,b) -> a/b);
	}
	
	public static void addnew(String key,MathOperation mo)
	{
		map.put(key, mo);
	}
	
	public static int calculate(String expression)
	{
		String[] exp = expression.split(" ");
		int onscreen = Integer.parseInt(exp[0]);
		
		for(int i=1;i<exp.length;i=i+2)
		{
			MathOperation op= map.get(exp[i]);
			int enteredno =Integer.parseInt(exp[i+1]);
			onscreen = calculate(onscreen, op , enteredno);
		}
		
		return onscreen;
	}
	
	
	
	
	
	
	
	public static int calculate(int onscreen, MathOperation mo, int enteredno)
	{
		return mo.operate(onscreen, enteredno);
	}

}
