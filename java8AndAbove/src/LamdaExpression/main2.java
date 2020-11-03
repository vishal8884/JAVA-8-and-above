package LamdaExpression;

public class main2 {

	public static void main(String[] args) {

		String ss=getdata().say("some random data");
		System.out.println(ss+" :in here");
	}

	public static Greet getdata()
	{
		Greet g = n -> n.toUpperCase();
		System.out.println(g.say("test"));
		return g;
	}
}
