package LamdaExpression;

public class main {

	public static void main(String[] args) {
		
				

		Greet g = name -> name.toUpperCase();
		sayinmain(g);
		
		
		
	}
	
	public static void sayinmain(Greet g)
	{
		
		System.out.println(g.say("vishal"));  //higher order function as reverse is happening
	}
	
	

}























/*
 * Greet g1 = new Greet() {
 * 
 * @Override public String say(String name) 
 * {
 * 
 * return name.substring(2, 4).toUpperCase();
 *  }
 * 
 * }; sayinmain(g1);
 */