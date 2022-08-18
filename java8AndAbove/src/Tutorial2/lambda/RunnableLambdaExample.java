package Tutorial2.lambda;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("threaddemo run method called");
	}
	
}


public class RunnableLambdaExample {

	public static void main(String[] args) {
		
		//traditional approach////////////////////////////////////////////////////////////////
		
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		
		
		//lambda appraoch/////////////////////////////////////////////////////////////////////
		
		Runnable runnable = () -> {
			System.out.println("called run method using lambda expression");
		};
		
		Thread threadLambda = new Thread(runnable);
		threadLambda.start();
		
		//lambda modified
		
		Runnable runnable2 = () -> System.out.println("called run method using lambda expression simplified");
		Thread threadLambdaSimplified = new Thread(runnable2);
		threadLambdaSimplified.start();
		
		/////////////////////////////////////////////////////////////////////////////////////
	}
}
