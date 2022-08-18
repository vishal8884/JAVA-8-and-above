package Tutorial2.lambda;


interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable{            //traditional way

	@Override
	public int addition(int a, int b) {
		return a+b;
	}
	
}

public class LambdaParameters {

	public static void main(String[] args) {
		
		/////////////////////// apprroach 2 (using annonymous inner type)//////////////////////////////////////////////////
		Addable a1 = new Addable() {
			@Override
			public int addition(int a, int b) {
				return a+b;
			}
		};
		
		int res_a1 = a1.addition(2, 3);
		System.out.println("res_a1 :: "+res_a1);
		
		
		///////////////////////// approcah 3 (using lambda expressions)///////////////////////////////////////////////////////
		Addable a2 = (a,b) -> {
			return a+b;
		};
		
		int res_a2 = a2.addition(8, 2);
		System.out.println("res_a2 :: "+res_a2);
		
		///simplified
		Addable a3 = (a,b) -> (a+b);
		int res_a3 = a3.addition(8, 2);
		System.out.println("res_a3 :: "+res_a3);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
