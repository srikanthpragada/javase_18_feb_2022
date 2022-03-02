package oop;

class Student {
	protected String name, email;

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
}

class JavaStudent extends Student {
	protected int theoryMarks;

	public JavaStudent(String name, String email, int theoryMarks) {
		super(name, email);
		this.theoryMarks = theoryMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.theoryMarks);
	}

	public int getMarks() {
		return this.theoryMarks;
	}

}

class PythonStudent extends Student {
	protected int projectMarks;

	public PythonStudent(String name, String email, int projectMarks) {
		super(name, email);
		this.projectMarks = projectMarks;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.projectMarks);
	}

	public int getMarks() {
		return this.projectMarks;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s = new JavaStudent("James", "james@gmail.com", 90); // Upcasting
		s.print();

		s = new PythonStudent("Van", "van@microsoft.com", 95); // Upcasting
		s.print();

		PythonStudent p;

		if (s instanceof PythonStudent)
			p = (PythonStudent) s; // Downcasting

	}

}
