package LamdaExpression.assignment;

public class assignmentmain {

	public static void main(String[] args) {

		MathOperation add = (a,b) -> a+b;
		MathOperation sub = (a,b) -> a-b;
		MathOperation mul = (a,b) -> a*b;
		MathOperation div = (a,b) -> a/b;
		
		System.out.println(operate(add));
		System.out.println(add.operate(5, 1));
	}
	
	
	
	public static int operate(MathOperation mo)
	{
		int a=4;
		int b=8;
		int sol=mo.operate(a, b);
		return sol;
	}

}
