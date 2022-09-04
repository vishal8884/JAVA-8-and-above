package Tutorial2.default_and_static_methods;

interface Vehicle {
	
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnAlarmOn() {
		return "turning vehicle alarm on";
	}
	
	default String turnAlarmOff() {
		return "turning vehicle alarm off";
	}
	
	static String getCompany() {
		return "BMW";
	}
	
}


class Car implements Vehicle {

	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public String speedUp() {
		return "The car is speeding up";
	}

	@Override
	public String slowDown() {
		return "The car is slowing down";
	}
	
}


public class DefaultAndStaticDemo {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		
		print(vehicle.getBrand());
		print(vehicle.speedUp());
		print(vehicle.slowDown());
		
		//Default methods .......automatically available to the vehicle object
		
		print(vehicle.turnAlarmOn());
		print(vehicle.turnAlarmOff());
		print(Vehicle.getCompany());
		
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
