package Tutorial2.functionalInterface;

public class RunnableDemo {
	
	class RunnableImpl implements Runnable{           //Traditional approach

		@Override
		public void run() {
			System.out.println("run method callled");
		}
		
	}

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("run method called");
		
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
