
public class TestStudents {

	public static void main(String[] args) {
		
		Student studentOne = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		Student studentTwo = new Student("Ann", "Milton", 30, "BGS", 2015);
		Student studentThree = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		
		System.out.println(studentOne);
		System.out.println(studentTwo);
		System.out.println(studentThree);

		if (studentOne.equals(studentThree))
			System.out.println("They match!");
		else
			System.out.println("They do not match!");

	}

}
