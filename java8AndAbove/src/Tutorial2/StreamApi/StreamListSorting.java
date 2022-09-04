package Tutorial2.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Mango");
		
		//Collections.sort(fruits);       normal approach
		
		//List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		//List<String> sortedFruits = fruits.stream().sorted().collect(Collectors.toList());  //noraml sort() also sorts in accending order
		List<String> sortedFruits = fruits.stream().sorted((o1,o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("sortedFruits :: "+sortedFruits);
		
		//List<String> sortedFruits = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		List<String> sortedFruitsDesc = fruits.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("sortedFruitsDesc :: "+sortedFruitsDesc);
		
		
		//-----------------------------------SORT objects based on salary/id/etc-------------------------------------------------------------------------------
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(2,"vishal", 1000));
		employeeList.add(new Employee(1,"abc", 390));
		employeeList.add(new Employee(3,"ravi", 2300));
		employeeList.add(new Employee(5,"bal", 100));
		employeeList.add(new Employee(4,"kalam", 990));
		
		
		List<Employee> sortedEmployById = employeeList                               //using annonymous inner type sort id
				.stream()
				.sorted(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getId() - o2.getId();
					}
					
				})
				.collect(Collectors.toList());
		System.out.println("sortedEmployById :: "+sortedEmployById);
		
		
		
		
		
		List<Employee> sortedEmployById2 = employeeList                               //using lamdba sort id (integer)
				.stream()
				.sorted((o1,o2) -> o1.getId() - o2.getId())
				.collect(Collectors.toList());
		System.out.println("sortedEmployById2 :: "+sortedEmployById2);
		
		
		
		
		
		
		
		List<Employee> sortedEmployByName = employeeList                               //using lambda sort name (String)
				.stream()
				.sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
				.collect(Collectors.toList());
		System.out.println("sortedEmployByName :: "+sortedEmployByName);
		
		
		
		
		
		
		List<Employee> sortedEmployByName2 = employeeList                               //using Comparator.comparing
				.stream()
				.sorted(Comparator.comparing((emp) -> emp.getName()))
				.collect(Collectors.toList());
		System.out.println("sortedEmployByName2 :: "+sortedEmployByName2);
		
		
		
		
		
		
		List<Employee> sortedEmployByNameDesc = employeeList                               //using Comparator.comparing sorting desc we need to add one more param to comparator method
				.stream()
				.sorted(Comparator.comparing((emp) -> emp.getName(),     (a,b) -> b.compareTo(a)))      //.sorted(Comparator.comparing(Employee:getName).reversed())
				.collect(Collectors.toList());
		System.out.println("sortedEmployByNameDesc :: "+sortedEmployByNameDesc);
		
	}

}


class Employee {
	
	private int id;
	private String name;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
