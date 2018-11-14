package vn.framgia.demo;

public class Teacher extends People implements Teach {

	public Teacher() {
		super();
	}
	
	public Teacher(String name) {
		super(name);
	}

	@Override
	public void teach() {
		System.out.println("Teacher is teaching!!");
	}

	@Override
	public void teach(Student student) {
		System.out.println("Teacher is teaching " + student.getName());
	}

}
