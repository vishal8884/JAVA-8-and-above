package Tutorial1.FunctionalInterface;

import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {

		//Supplier<Double> random = () -> Math.random();
		Supplier<Double> random = Math::random;
		System.out.println(random.get());
	}

}
