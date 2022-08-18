package Tutorial2.lambda;

interface shape2 {  //this is functional interface
	void draw();
}

class Rectangle2 implements shape2{
	
	@Override
	public void draw() {
		System.out.println("Rectangle class draw() method");
	}
}

class Square2 implements shape2{
	
	@Override
	public void draw() {
		System.out.println("Square class draw() method");
	}
}

class Circle2 implements shape2{
	
	@Override
	public void draw() {
		System.out.println("Circle class draw() method");
	}
}

public class OldTypeJava7InterfaceExample {

}
