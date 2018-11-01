/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Person{
	private String firstName;
	private String lastName;
 
	public Person(String f, String l){
		firstName = f;
		lastName = l;
	}
 
	public void print(){
		System.out.println(firstName + " " + lastName);
	}
 
}
 
/* Name of the class has to be "Main" only if the class is public. */
class Employee extends Person{
	private String employeeNum;
	private double hourlyRate;
	
	public Employee(String f, String l, String e, double h){
		super(f, l);
		employeeNum = e;
		hourlyRate = h;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println(employeeNum = " " + hourlyRate);
	}
}
class PersonTest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Person aPerson = new Person("Bob", "Smith");
		Employee anEmployee = new Employee("Ann", "Miller", "0001", 17.5);
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(aPerson);
		list.add(anEmployee);
		
		list.get(0).print(); //Person
		list.get(1).print(); //employee
	}
}