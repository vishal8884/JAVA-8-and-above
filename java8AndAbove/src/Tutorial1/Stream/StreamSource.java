package Tutorial1.Stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSource {

	public static void main(String[] args) {

		String a ="ball";
		String b ="apple";
		String c ="cat";
		
		System.out.println(
				
				Stream.of(a,b,c)
				.min(Comparator.reverseOrder())
		        //.get()
		
				);
	}

}
