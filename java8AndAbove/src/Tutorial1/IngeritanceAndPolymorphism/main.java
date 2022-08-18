package Tutorial1.IngeritanceAndPolymorphism;

public class main {

	public static void main(String[] args) {

		Cat c = new Cat();
		action(c);
		
	}
	
	
	public static void action(Animal a)
	{
		a.walk();
		a.voice();
	}

}
