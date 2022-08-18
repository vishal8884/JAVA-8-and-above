package Tutorial1.playaround;

import java.util.function.Consumer;

import Tutorial1.LamdaExpression.assignment.CalculatorAssignmentFull;

public class maintest {

	public static void main(String[] args) {

		
		Person person = new Person("vishal","n",22);
		Person p2 = new Person("naruto","uzumaki",33);
		Consumer<Person> c1 =(p) ->System.out.println(p);
		c1.accept(person);
		c1.accept(p2);
		
		/////////////////
		
String exp = "1 + 2 - 1";
		
		CalcPlay c = new CalcPlay();
		int a=c.calculate(exp);
		System.out.println(a+" calculated");
	}

}
