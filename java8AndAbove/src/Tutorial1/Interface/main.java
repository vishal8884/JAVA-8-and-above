package Tutorial1.Interface;

public class main {

	public static void main(String[] args) {

		Clock c = new Clock();
		GoogleMini m = new GoogleMini();
		Iphone i = new Iphone();
		
		ring(c);
		ring(m);
		ring(i);
	}
	
	
	public static void ring(Alarm a)
	{
		a.alarm();
	}

}
