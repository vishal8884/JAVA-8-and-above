package Stream.sum;

import java.util.stream.IntStream;

public class IntStreamForLoop {

	public static void main(String[] args) {

		IntStream.range(0, 9)
		 .forEach(i -> System.out.println(i));
	}

}
