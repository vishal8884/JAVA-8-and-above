package LamdaExpression;

public class main3 {

	public static void main(String[] args) {

		//StringOps so = s -> System.out.println(s);
		StringOps so = System.out::println;   //same as above (ie if you want to pass same parameter in return function you need to use this
		
		//StringOps so = s -> Objects.isNull(s);
		//StringOps so = s -> Objects::isNull;  //method reference
		//StringOps so = s -> String::toUpperCase;  //s.toUpperCase
		so.accept("my data");
		
		
	}
	
	
	
	

}
