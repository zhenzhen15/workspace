package testdemo;

import part2.Student;

public class TestPersonStudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setAge(12);
		student.setName("sd");
		student.school="����";
		System.out.println(student.getName()+student.getAge()+student.school);
		

	}

}
