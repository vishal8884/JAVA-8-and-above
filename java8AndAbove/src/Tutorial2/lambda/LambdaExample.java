package Tutorial2.lambda;


interface Shape { // this is functional interface
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class draw() method");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square class draw() method");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle class draw() method");
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		Shape rectangle = () -> System.out.println("Rectangle class draw() method");      //here we are directly implementing instead of creating a 
		rectangle.draw();                                                                 //seperate impl class for functional interface
		
		Shape square = () -> {
			System.out.println("Square class draw() method");
		};
		square.draw();
		
		Shape circle = () -> System.out.println("Circle class draw() method");
		circle.draw();
	}

}
