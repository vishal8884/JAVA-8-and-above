package Tutorial1.LamdaExpression;
import java.util.*;
public class StringOps2Main {
	
	public static final List<String> list = new ArrayList<String>();

	public static void main(String[] args) {

		 
		 
		 //StringOps so = (s) -> list.add(s);
		StringOps so = list::add;
		 so.accept("one");
		 
		 System.out.println(list);
	}

}
