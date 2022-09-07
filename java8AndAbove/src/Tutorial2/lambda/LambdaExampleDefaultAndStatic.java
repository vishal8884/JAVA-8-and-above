package Tutorial2.lambda;


interface Shape2 { // this is functional interface
	void draw();
	
	default void m1() {                                //not compulsary to implement this method as its default    
		System.out.println("m1 default method");
	}
}

class Rectangle2 implements Shape2 {

	@Override
	public void draw() {
		System.out.println("Rectangle class draw() method");
	}
}

class Square2 implements Shape2 {

	@Override
	public void draw() {
		System.out.println("Square class draw() method");
	}
}

class Circle2 implements Shape2 {

	@Override
	public void draw() {
		System.out.println("Circle class draw() method");
	}
}

public class LambdaExampleDefaultAndStatic {

	public static void main(String[] args) {

		Shape2 rectangle = () -> System.out.println("Rectangle class draw() method");      //here we are directly implementing instead of creating a 
		rectangle.draw();                                                                 //seperate impl class for functional interface
		
		Shape2 square = () -> {
			System.out.println("Square class draw() method");
		};
		square.draw();
		
		Shape2 circle = () -> System.out.println("Circle class draw() method");
		circle.draw();
		
		//short way
		System.out.println();
		
		printShape(rectangle);
		printShape(square);
		printShape(circle);
		
	}
	
	public static void printShape(Shape2 shape) {
		shape.draw();
	}

}
