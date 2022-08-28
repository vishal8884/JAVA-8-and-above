package Tutorial2.functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterfaceDemo {
	
	class SupplierImpl implements Supplier<LocalDateTime>{        //Traditional approach
		@Override
		public LocalDateTime get() {
			return LocalDateTime.now();
		}
		
	}

	public static void main(String[] args) {
		
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
	}
}
