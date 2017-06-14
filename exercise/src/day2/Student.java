package day2;

public class Student extends Person{
	public Student(String name,int age,String occuption){
		this.name = name;
		this.age = age;
		this.occupation = occuption;
	}

	@Override
	public String talk() {
		// TODO Auto-generated method stub
		return "学生姓名："+this.name+",年龄："+this.age+",职业："+this.occupation;
	}

}
