package LamdaExpression;

public class tempmain {

	public static void main(String[] args) {

		TempI add = (a,b) -> a+b;
		System.out.println(operate(add));
		
	}
	
	public static int operate(TempI t)
	{
		return t.operate(2, 3);
		
	}
	
	
	

}
