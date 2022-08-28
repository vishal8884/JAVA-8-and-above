package Tutorial2.functionalInterface.sample;

@FunctionalInterface
public interface MyFunctionalInterace {  //functional interface has only 1 abstract method

	                                     //any number of default and static method
	
	void print(String msg);
	
	default void m1() {
		System.out.println("inside m1");
	}
	
	static void m2() {
		System.out.println("inside m2");
	}
}
