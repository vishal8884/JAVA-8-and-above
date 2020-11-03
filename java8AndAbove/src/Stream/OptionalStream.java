package Stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStream {

	public static void main(String[] args) {

		String a ="ball";
		String b ="apple";
		String c ="cat";
		
		Optional<String> small = findsmall(a,b,c);
		
		if(small.isPresent())
		{
			System.out.println(small.get());
		}
		else
		{
			System.out.println("no small present");
		}
	}
	
	
	
	public static Optional<String> findsmall(String a,String b,String c)
	{
		
		Optional<String> str=Stream.of(a,b,c)
				.min(Comparator.naturalOrder());
		
		return str;
		
		
	}

}
