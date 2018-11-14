package vn.framgia.demo;

public class Student extends People{
	private String className;
	private Teacher teacher;
	// initialization block
	{
		this.className = "fresher java";
		this.teacher = new Teacher();
		this.teacher.setName("Vu Thi Tran Van");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String className, Teacher teacher) {
		super();
		this.className = className;
		this.teacher = teacher;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [className=" + className + ", teacher=" + teacher + ", getClassName()=" + getClassName()
				+ ", getTeacher()=" + getTeacher() + ", getName()=" + getName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
