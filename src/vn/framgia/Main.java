package vn.framgia;

import vn.framgia.demo.People;
import vn.framgia.demo.Student;
import vn.framgia.demo.Teacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student;

		People[] array = new People[10];
		array[0] = new Student("fresher java", new Teacher("teacher1"));
		array[1] = new Teacher();
		if (array[0] instanceof Student) {
			student = (Student) array[0];
		}
		
	}

}
