package Tutorial2.forEach;

import java.util.ArrayList;
import java.util.List;

public class ListForEachExample {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person("vishal", 24));
		list.add(new Person("vishal2", 25));
		list.add(new Person("vishal3", 26));
		list.add(new Person("vishal4", 27));
		
		//prior java 8-----------------------------------------------------------------------------------------------------------------
		for(Person person : list) {
			System.out.println("person name :: "+person.getName()+"      person age :: "+person.getAge());
		}
		
		System.out.println();
		//after java 8---------------------------------------------------------------------------------------------------------------
		
		list.forEach(person -> System.out.println("person name :: "+person.getName()+"      person age :: "+person.getAge()));
		System.out.println();
		
		//java 8 stream-------------------------------------------------------------------------------------------------------------------
		
		list.stream().forEach(person -> System.out.println("person name :: "+person.getName()+"      person age :: "+person.getAge()));
		
	}

}


class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}